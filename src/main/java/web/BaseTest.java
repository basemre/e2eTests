package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private WebDriver driver;

    @BeforeSuite
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    @AfterSuite
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
