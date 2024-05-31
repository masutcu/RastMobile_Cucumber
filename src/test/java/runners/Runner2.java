package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:TestOutput/Report/CucumberReportNegative.html",
        "json:target/json-reports/cucumberN.json",
        "junit:TestOutput/Report/cucumberN.xml",
        "rerun:TestOutput/failed_scenarioN.txt"},
        features = "src/test/resources/features",
        glue ={"stepDefinitions","hooks"},

        tags ="@negative",

        dryRun = false,
        monochrome = true)
public class Runner2 {
}
