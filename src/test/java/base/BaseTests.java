package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

      /*  WebElement inputsLinks = driver.findElement(By.linkText("Shifting Content"));
        inputsLinks.click();
        WebElement inputsLink1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println("Number of links " + links.size());
      */
        homePage = new HomePage(driver);

        //System.out.println(driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /*
    public static void main(String[] args) {
        BaseTests tests=new BaseTests();
        tests.setUp();
    }
    */
}