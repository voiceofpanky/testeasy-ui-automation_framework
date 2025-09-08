package util;

import com.automation.qa.ttafuicore.driver.DriverFactory;
import com.automation.qa.ttafuicore.util.Constant;
import io.qameta.allure.Allure;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

    public class DriverManager {
        public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();
        private static final Logger LOGGER = Logger.getLogger(String.valueOf(com.automation.qa.ttafuicore.driver.DriverManager.class));

        public DriverManager() {
        }

        public static RemoteWebDriver getDriver() {
            if (driver.get() == null) {
                LOGGER.info("Thread has no WedDriver, creating new one");
                Allure.parameter("Browser", com.automation.qa.ttafuicore.util.Constant.BROWSER_NAME);
                DriverFactory.createInstance(com.automation.qa.ttafuicore.util.Constant.BROWSER_NAME, com.automation.qa.ttafuicore.util.Constant.BROWSER_VERSION, Constant.PLATFORM);
            }

            LOGGER.info("Getting instance of remote driver" + ((RemoteWebDriver)driver.get()).getClass());
            return (RemoteWebDriver)driver.get();
        }

        public static String getBrowserInfo() {
            LOGGER.info("Getting browser info");
            Capabilities cap = getDriver().getCapabilities();
            String browserN = cap.getBrowserName();
            String os = cap.getPlatform().toString();
            String browserV = cap.getVersion();
            return String.format("%s v:%s %s", browserN, browserV, os);
        }
    }

