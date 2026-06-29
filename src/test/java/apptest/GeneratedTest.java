package apptest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    private AndroidDriver<AndroidElement> driver = null;
    private DesiredCapabilities dc = new DesiredCapabilities();
    String accessKey = System.getenv("SEETEST_IO_ACCESS_KEY");
  
    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "1");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@serialnumber='RF8N1283Y3W'");
        driver = new AndroidDriver<>(new URL("https://uscloud.experitest.com/wd/hub"), dc);
    }

    @Test
    public void generatedMethod() {
        driver.executeScript("seetest:client.launch", "com.experitest.ExperiBank/.LoginActivity", false, false);
        driver.findElementByXPath("//*[@id='usernameTextField']").sendKeys("company");
        driver.findElementByXPath("//*[@id='passwordTextField']").sendKeys("company");
        driver.findElementByXPath("//*[@text='Login']").click();
        driver.findElementByXPath("//*[@text='Logout']").click();
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
