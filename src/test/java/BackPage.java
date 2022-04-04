import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BackPage extends BaseTest{
    @Step("<int> saniye_back")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("<id> Back butununa tıkla")
    public void clickBackElement(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.click();
        ilogger.logger.info("back butonuna basildi.");
    }
}
