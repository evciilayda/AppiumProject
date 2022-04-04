import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.time.Duration;

public class ScrollPage extends BaseTest {
    @Step("<int> saniye_scroll")
    public void waitForSecond(int s)throws InterruptedException{
        Thread.sleep(1000 *s);
    }
    @Step("Sayfayı scroll et")
    public void swipeUp(){
        final int ANIMATION_TIME= 200;
        final int PRESS_TIME = 200;
        int edgeBorder= 10;
        PointOption pointOptionStart, pointOptionEnd;

        Dimension dims= appiumDriver.manage().window().getSize();
        pointOptionStart =PointOption.point(dims.width/2, dims.height/2);
        pointOptionEnd =PointOption.point(dims.width/2, dims.height/4);
        ilogger.logger.info("Ekran scroll edildi.");
        try{
            new TouchAction(appiumDriver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        }catch(Exception e){
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }



    }


