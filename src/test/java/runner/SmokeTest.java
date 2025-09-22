package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * Created by Pankaj Sao on 11/7/2020.
 */
@CucumberOptions(
        dryRun = false, // Skip execution of glue code.
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        plugin = {
                // "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "pretty",
                "json:target/cucumber-reports/smokeTestResults.json",
                "html:target/cucumber-reports"
        },
        monochrome = false, // Don't colour terminal output.
        tags = "@smoke"
)
@Test
public class SmokeTest extends AbstractTestNGCucumberTests {
}
