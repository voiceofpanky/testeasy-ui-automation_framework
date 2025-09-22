package custom;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"json:target/cucumber-report-feature-composite.json"}
)
public class CustomAbstractTestNGCucumberTests extends AbstractTestNGCucumberTests {
    @BeforeClass(
            alwaysRun = true
    )
    public void setUpClass(org.testng.ITestContext context) {
        super.setUpClass(context);
    }

    @Test(
            groups = {"cucumber"},
            description = "Runs Cucumber Scenarios",
            dataProvider = "scenarios"
    )
    public void scenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        super.runScenario(pickleWrapper, featureWrapper);
    }
}
