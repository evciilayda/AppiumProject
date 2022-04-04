import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {

    @Step("<int> saniye kadar bekle")
    public void waitForSecond(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
    }

    @Step("<id> elementin sayfada gorunur oldugunu kontrol et ve tıkla")
    public void findbyElementandClick(String id) {

        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        ilogger.logger.info("Uygulamanin acildigi kontrol edildi");

        MobileElement element = appiumDriver.findElement(By.id(id));
        element.click();

    }

}
