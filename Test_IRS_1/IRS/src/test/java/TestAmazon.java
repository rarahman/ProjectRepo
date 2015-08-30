import CommonAPI.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by TRCentauri on 8/29/15.
 */
public class TestAmazon extends Base {
    @Test

    public void amznTest() throws InterruptedException{
        //Search for product.
        driver.findElement(By.cssSelector("twotabsearchtextbox")).sendKeys("iPad", Keys.ENTER);

    }

}
