package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OpenSourceTest extends BaseOpenSourceTest {

    @Test
    public void verifyUrl() throws InterruptedException {
        DriverUtilities driverUtility = new DriverUtilities(driver);
        Assert.assertEquals(driverUtility.getUrl(),"https://opensource-demo.orangehrmlive.com/");
        OpenSourceForms forms = new OpenSourceForms(driver);
        forms.fillingLogInForm("Admin", "admin123");
        driverUtility.clickBtn("btnLogin");
        Assert.assertTrue(driverUtility.getUrl().contains("dashboard"));
    }

}
