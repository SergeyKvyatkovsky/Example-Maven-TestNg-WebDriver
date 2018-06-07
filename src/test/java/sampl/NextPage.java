package sampl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 07.06.2018.
 */
public class NextPage {
    private WebDriver driver;


    public NextPage(WebDriver driver) {
        this.driver = driver;
    }

    protected By formEmail = By.xpath(".//textarea[@class = 'js-input compose__labels__input' and @data-original-name = 'To']");
    protected By formTheme = By.xpath(".//input[@class='b-input']");
    protected By buttonSend = By .xpath(".//span[text() = 'Отправить']");


    public String pressButtonWriteEmailWriteMailAndSend(){

        WebElement dynamicElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='b-toolbar__left']/div/div/div[2]/div")));
        dynamicElement.click();
        driver.findElement(formEmail).sendKeys("moveton@tut.by");
        driver.findElement(formEmail).sendKeys(Keys.ENTER);
        driver.findElement(formTheme).sendKeys("test12");
        driver.findElement(formTheme).sendKeys(Keys.TAB,"Privet");
        driver.findElement(buttonSend).click();
        WebElement dynamicElementT = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='b-compose__sent']/div/div[1]/div")));
        String s = dynamicElementT.getText();
        System.out.println(s);
        return s;
    }


}
