package web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import web.pages.ProductPage;

public class ProductTests extends BaseTest {


    @BeforeTest
    public void SetUp(){

        getDriver().get("https://www.amazon.com/All-new-Kindle-Built-Front-Light/dp/B07HSJKS3S/ref=sr_1_2?dchild=1&keywords=kindle&qid=1594321759&sr=8-2");
    }

    @Test
    public void GetAProduct(){
        ProductPage simpleProductPage = new ProductPage(getDriver());
        simpleProductPage.waitForElementUntilAppear(By.id("buy-now-button"));
    }

    @Test
    public void CheckProductPrice(){
        ProductPage kindlePage=new ProductPage(getDriver());
        Assert.assertEquals(kindlePage.getProductPrice(),
                "$79.99");
    }

    @Test
    public void CheckAProductCanBeAddedToCart(){
        ProductPage kindlePage=new ProductPage(getDriver());
        String priceBeforeCover = kindlePage.getProductPrice();
        kindlePage.addCovertoOrder();
        kindlePage.clickAddToCartBttn();
        Assert.assertNotEquals(priceBeforeCover, kindlePage.getSubTotal());
        System.out.println("Price before cover: " + priceBeforeCover + "\n"
                         + "Price after cover: " + kindlePage.getSubTotal());

    }
}
