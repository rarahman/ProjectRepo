import CommonAPI.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by TRCentauri on 8/30/15.
 */
public class TestCharacter extends Base {
    @Test
    public void charArcadeTest() throws InterruptedException{
        //Get Title
        System.out.println(driver.getTitle());
        //Click on 'Action' tab.
        driver.findElement(By.xpath(".//*[@id='nav']/ul/li[2]/a/cufon/canvas")).click();
        driver.navigate().back();
        //Login
        driver.findElement(By.cssSelector(".login_btn.link_button.cursor-pointer")).click();

    }
}

