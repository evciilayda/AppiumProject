import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingPage extends BaseTest{

    @Step ("<int> saniye bekle")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }

    @Step("<id> Kategori elementinin sayfada gorunur oldugunu kontrol et")
    public void findbyElementandClick(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        if (element.isDisplayed()){
            element.click();
            ilogger.logger.info("Kategori sayfasi acildi");
        }else{
            System.out.println("Kontrol edilen element Görünür olmadı");
        }

    }

}
