package CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by TRCentauri on 8/29/15.
 */

public class Base {

    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url) {
        driver = new FirefoxDriver(); //Loading the driver.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Wait some time for the browser to load.
        driver.navigate().to(url); //Used the supplied URL to go to the website.
        driver.manage().window().maximize(); //Maximize the browser window.
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException{
        Thread.sleep(2000); //Waits 2 seconds after test is complete.
        driver.quit(); //Quits the browser.
    }

}

