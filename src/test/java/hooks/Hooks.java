package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;




public class Hooks extends ReusableMethods {

    @After
    public void tearDown(Scenario scenario)  {
        if (scenario.isFailed()) {
            byte[] screenshotAs = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotAs, "image/png", "Hata Resmi");
        }
    }


    @AfterAll
    public static void afterAll(){
        bekle(5);
        //Raporun test bittikten sonra otomatik açılması için raporuAc() metodu içinde browser yolunun değişririlmesi lazımdır.
        //raporuAc();

    }
}
