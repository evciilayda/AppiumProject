import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static java.awt.SystemColor.text;

public class LoginPage extends BaseTest{

    @Step("<id> saniye_login")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
        ilogger.logger.info("Login sayfasina girildigi dogrulandi");
    }
    @Step("<id> e-posta alanına gir")
    public void sendKeysToEMail(String id) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.sendKeys("text");
        ilogger.logger.info("E-posta alanina text yazildi.");
    }
    @Step("<id> password alanını gir")
    public void sendKeystoPassword(String id) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.sendKeys("12345");
        ilogger.logger.info("Password alanina sifre girildi");
    }

    }