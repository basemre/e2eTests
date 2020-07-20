package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

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

    @DataProvider(name = "productPages")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"https://www.amazon.com/All-new-Kindle-Built-Front-Light/dp/B07HSJKS3S/ref=sr_1_2?dchild=1&keywords=kindle&qid=1594321759&sr=8-2", "$59.99"},
                {"https://www.amazon.com/dp/B07MLY3JKV?ref=MarsFS_AUCC_cst", "$24.99"}
        };
    }

    @AfterSuite
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
