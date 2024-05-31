package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:TestOutput/Report/CucumberReportPositive.html",
        "json:target/json-reports/cucumberP.json",
        "junit:TestOutput/Report/cucumberP.xml",
        "rerun:TestOutput/failed_scenarioP.txt"},
        features = "src/test/resources/features",
        glue ={"stepDefinitions","hooks"},

        tags ="@positive",
        //testler parallel çalıştırılmak isteniyorsa terminalden: mvn clean test
        dryRun = false,
        monochrome = true)
public class Runner {
}
