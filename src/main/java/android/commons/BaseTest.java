package android.commons;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        //APK URL: https://apkpure.com/tr/bein-connect/com.digiturk.iq.mobil
        //APK information: aapt -- https://stackoverflow.com/a/25275809
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 2");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("appActivity", "com.digiturk.iq.mobil.provider.view.splash.SplashActivity");
        caps.setCapability("appPackage", "com.digiturk.iq.mobil");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }
}
