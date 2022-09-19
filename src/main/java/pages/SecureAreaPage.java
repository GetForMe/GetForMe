package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");
    private By statusForgot = By.cssSelector("h1");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    public String getHeaderText(){
        return driver.findElement(statusForgot).getText();
    }
}
