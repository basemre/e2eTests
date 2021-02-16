package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "priceblock_ourprice")
    private WebElement productPrice;


    public String getProductPrice(){
        return productPrice.getText();
    }



}
