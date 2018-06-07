package sampl;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class WebDriverSetting {
    public ChromeDriver driver;
    @BeforeGroups(groups = "auth")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",".\\resurses\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        String s = "https://mail.ru";//
        driver.manage().window().maximize();
        driver.get(s);
    }

    @AfterGroups(groups = "auth")
    public void closedBrowser(){
        System.out.println("Browser close");
        driver.quit();
    }



}
