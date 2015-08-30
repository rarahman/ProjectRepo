import CommonAPI.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by TRCentauri on 8/29/15.
 */
public class Test1 extends Base {
    @Test

    public void webIRS() throws InterruptedException{
        //System.out.println();
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#anch_21")).click();
        driver.navigate().back();
        //driver.findElement(By.id("anch_22")).click();
        //Thread.sleep(2000);
        //Click on Search box
       // driver.findElement(By.id("sitesearchtext")).sendKeys("1040 Form", Keys.ENTER);
    }

    //goFiling: ".//*[@id='anch_21']"
    //goNews: ".//*[@id='anch_25']"


}
