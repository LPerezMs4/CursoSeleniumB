package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenSourceForms {

    WebDriver driver;

    public OpenSourceForms(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public void fillingLogInForm(String name, String pass) {
        driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(name);
        driver.findElement(By.name("txtPassword")).sendKeys(pass);
    }

}
