package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgotPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String emailF){
        driver.findElement(emailField).sendKeys(emailF);
    }
    public SecureAreaPage clickRetrievePassword(){
        driver.findElement(retrieveButton).click();
        return new SecureAreaPage(driver);
    }
}
