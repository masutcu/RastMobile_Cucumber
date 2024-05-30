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
        glue ={"stepDefinitions","hooks"},

        tags ="@rast",

        dryRun = false,
        monochrome = true)
public class Runner {
}
