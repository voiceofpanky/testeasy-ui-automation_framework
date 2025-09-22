package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.Constant;
import util.DriverManager;

/**
 * Created by Pankaj Sao on 11/7/2020.
 */
public class ServiceHooks {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ServiceHooks.class));

    @After
    public void after(Scenario scenario) throws Exception {
        RemoteWebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            Constant.SCENARIO_NAME = scenario.getName(); //set the scenario name to create a node in Reporter
            driver.quit();
            LOGGER.info("TESTEASY MESSAGE: Closing the " + Constant.BROWSER_NAME + " browser...");
        }
    }
}
