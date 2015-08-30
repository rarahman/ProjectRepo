import CommonAPI.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

/**
 * Created by malihahasantuba on 8/29/15.
 */
public class Test2 extends Base {

    @Test
    //We are creating a method over here.
    public void irsWebTest() throws InterruptedException {


        //System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("people and tech", Keys.ENTER);
        // System.out.println("Title:" + i + driver.getTitle());
        //driver.navigate().back();


    }
}