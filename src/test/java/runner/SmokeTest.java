package runner;

import cucumber.api.CucumberOptions;
import custom.CustomAbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * Created by Pankaj Sao on 11/7/2020.
 */
@CucumberOptions(
        dryRun = false,//Skip execution of glue code.
        strict = true,// Treat undefined and pending steps as errors.
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        plugin = {
              //  "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "pretty",
                "json:target/cucumber-reports/smokeTestResults.json",
                "html:target/cucumber-reports"
        },
        monochrome = false,//Don't colour terminal output.
        tags = {"@smoke"}
)
@Test
public class SmokeTest extends CustomAbstractTestNGCucumberTests {
}
