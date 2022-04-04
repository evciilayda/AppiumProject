import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AddtoCartPage extends BaseTest{
    @Step("<id> saniye_add")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("<id> Sepete ekle butununa tıkla")
    public void clickBackElement(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.click();
        ilogger.logger.info("Secilen urun sepete eklendi.");
    }
}
