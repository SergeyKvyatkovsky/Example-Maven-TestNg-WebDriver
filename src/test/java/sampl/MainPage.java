package sampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    private WebDriver driver;

    protected By loginForm = By.xpath("//*[@id='mailbox:login']");
    protected By passwordForm = By.xpath("//*[@id='mailbox:password']");
    protected By buttonEnter = By.xpath("//*[@id=\"mailbox:submit\"]/input");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public NextPage EnterLoginAndPassword(String login,String password){
        driver.findElement(loginForm).sendKeys(login);
        driver.findElement(passwordForm).sendKeys(password);
        driver.findElement(buttonEnter).click();
        return new NextPage(driver);
    }



}
