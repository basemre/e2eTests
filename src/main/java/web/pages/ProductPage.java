package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.BasePage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "priceblock_ourprice")
    private WebElement productPrice;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[8]/div[1]/div[4]/div/div/div/form/div[1]/div/div/div/div[5]/div/div[2]/div[1]/ul/li[1]/span/div[1]/label/input")
    private WebElement coverCheckBox;

    @FindBy(name = "submit.add-to-cart")
    private WebElement addToCartBttn;

    @FindBy(css = ".a-color-price.hlb-price.a-inline-block.a-text-bold")
    private WebElement subTotal;


    public String getProductPrice(){
        return productPrice.getText();
    }

    public void addCovertoOrder(){
        coverCheckBox.click();
    }

    public void clickAddToCartBttn(){
        addToCartBttn.click();
    }

    public String getSubTotal(){
        return subTotal.getText();
    }
}
