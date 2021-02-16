package web;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import web.pages.ProductPage;

public class ProductTests extends BaseTest {

    @BeforeTest
    public void SetUp(){
        super.beforeAll();
    }

    @Test(dataProvider = "productPages")
    public void CheckProductPrice(String productPageLink, String productPrice){
        ProductPage kindlePage=new ProductPage(driver);
        driver.get(productPageLink);
        Assert.assertEquals(kindlePage.getProductPrice(), productPrice);
    }
}
