package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverUtilities {

    WebDriver driver;

    public DriverUtilities(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public String getUrl (){
        return driver.getCurrentUrl();
    }

    public void clickBtn (String idElement){
        driver.findElement(By.id(idElement)).click();
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(3000);
    }

}
