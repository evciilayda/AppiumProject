import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class PantsPage extends BaseTest{
    @Step("<int> saniye_pants")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("Xpath <xpath> li elemente tıkla")
    public void clickElement(String xpath){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
        ilogger.logger.info("Pantolon kategorisi acildi");
    }
}
