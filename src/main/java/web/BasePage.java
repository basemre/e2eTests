package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, 15);
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 15),
                this);
    }

    protected void waitForElementUntilAppear(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementUntilDisappear(By loocator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loocator));
    }
}
