package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
    }


    @DataProvider(name = "productPages")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"https://www.amazon.com/All-new-Kindle-Built-Front-Light/dp/B07HSJKS3S/ref=sr_1_2?dchild=1&keywords=kindle&qid=1594321759&sr=8-2", "$79.99"},
                {"https://www.amazon.com/dp/B08GTYBCYN/ref=twister_B08F9ZCTCL?_encoding=UTF8&psc=1", "$79.98"}
        };
    }

    @AfterSuite
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
