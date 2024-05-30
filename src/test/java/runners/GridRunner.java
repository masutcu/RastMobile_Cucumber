package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:TestOutput/Report/cucumberHooks.html",
        "json:target/json-reports/cucumber.json",
        "junit:TestOutput/Report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "src/test/resources/features",
        glue ={"stepDefinitions"},

        tags ="@gridCross",
        /*DİKKAT: Bu Grid feature'un çalışması için içinde
          selenium server jar dosyası ve browserların yüklü olduğu klasörde terminal açılarak
          "java -jar selenium-server-4.14.0.jar standalone" komutu girilmelidir.*/
        dryRun = false,
        monochrome = true)
public class GridRunner {
}
