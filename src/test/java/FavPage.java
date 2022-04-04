import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class FavPage extends BaseTest{

    @Step("<int> saniye_fav")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("<id> fav butonunun sayfada oldugunu kontrol et ve tıkla")
    public void findByFavElementandClick(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        if(element.isDisplayed()){
            element.click();
            ilogger.logger.info("Urun detayi sayfasinin geldigi kontrol edildi ve urun favoriler butonuna tiklandi");
        }else{
            System.out.println("Fav Element is not visible");
        }
    }
}

