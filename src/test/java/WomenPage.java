import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class WomenPage extends BaseTest{
    @Step("<int> saniye")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("Xpath <xpath> li elementi bul ve tıkla")
    public void clickElement(String xpath){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
        ilogger.logger.info("Kadin secenegine tiklandi");
        }
    }

