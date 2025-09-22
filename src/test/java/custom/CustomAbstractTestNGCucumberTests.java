// package custom;
// //
// // Source code recreated from a .class file by IntelliJ IDEA
// // (powered by Fernflower decompiler)
// //

// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;
// import io.cucumber.testng.FeatureWrapper;
// import io.cucumber.testng.PickleWrapper;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Test;

// @CucumberOptions(
//         strict = true,
//         plugin = {"json:target/cucumber-report-feature-composite.json"}
// )
// public class CustomAbstractTestNGCucumberTests extends AbstractTestNGCucumberTests {
//     @BeforeClass(
//             alwaysRun = true
//     )
//     public void setUpClass() throws Exception {
//         super.setUpClass();
//     }

//     @Test(
//             groups = {"cucumber"},
//             description = "Runs Cucumber Scenarios",
//             dataProvider = "scenarios"
//     )
//     public void scenario(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature) throws Throwable {
//         super.scenario(pickleEvent.getPickleEvent(), cucumberFeature.getCucumberFeature());
//     }

//     @DataProvider(
//             parallel = true
//     )
//     public Object[][] scenarios() {
//         return super.scenarios();
//     }

//     @AfterClass(
//             alwaysRun = true
//     )
//     public void tearDownClass() throws Exception {
//         super.tearDownClass();
//     }
// }
