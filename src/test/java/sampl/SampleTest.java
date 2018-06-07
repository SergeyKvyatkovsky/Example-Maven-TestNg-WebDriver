package sampl;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTest extends WebDriverSetting{

    @Test(groups = "auth")
    public void testSendMail(){
        MainPage mainPage = new MainPage(driver);
        NextPage nextPage = mainPage.EnterLoginAndPassword("serj.kvyat244@mail.ru","12345678Ss");
        String AssertString = nextPage.pressButtonWriteEmailWriteMailAndSend();
        Assert.assertEquals(AssertString,"Ваше письмо отправлено. Перейти во Входящие");
    }
}
