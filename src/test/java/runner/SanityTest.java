package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * Created by Pankaj Sao on 11/10/2020.
 */
@CucumberOptions(
        dryRun = false, // Skip execution of glue code.
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/regressionTestResults.json",
                "html:target/cucumber-reports/regressionTestResults.html"
        },
        monochrome = false, // Don't colour terminal output.
        tags = "@sanity"
)
@Test
public class SanityTest extends AbstractTestNGCucumberTests {
}

