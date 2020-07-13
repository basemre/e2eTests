package android;

import android.commons.BaseTest;
import android.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {
    @Test
    public void checkVisibilityOfGirisYapBttn(){
        HomePage page = new HomePage(driver);
        page.visibilityOfGirisYapBttn();
    }
}
