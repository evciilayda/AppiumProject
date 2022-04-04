import com.thoughtworks.gauge.Step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomPage extends BaseTest {
    @Step("Random ürün seç")
    public void randomSelect() {

        List<MobileElement> productSelect = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));

        int maxProducts = productSelect.size();

        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);

        productSelect.get(randomProduct).click();
        ilogger.logger.info("Rastgele urun secildi");

    }
    @Step("<int> saniye_random")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
}
