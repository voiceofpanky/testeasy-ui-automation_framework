package util;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.net.URL;
import java.util.Properties;

import com.automation.qa.ttafuicore.util.FrameworkProperties;
import org.apache.log4j.Logger;

public class Constant {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(com.automation.qa.ttafuicore.util.Constant.class));
    private static final String DRIVER_TYPE_KEY = "driverType";
    private static final String DRIVER_LOCATION_KEY = "driverLocation";
    private static final String BROWSER_NAME_KEY = "browser";
    private static final String TIMEOUT_IMPLICIT_KEY = "implicitWaitTime";
    private static final String URL_KEY = "url";
    private static final String BROWSER_VERSION_KEY = "browserVersion";
    private static final String PLATFORM_KEY = "platform";
    private static final String HUBURL_KEY = "hubURL";
    private static final String GRID_MODE_KEY = "grid-mode";
    private static Properties properties;
    public static String DRIVER_TYPE;
    public static String DRIVER_LOCATION;
    public static String BROWSER_NAME;
    public static int TIMEOUT_IMPLICIT;
    public static String URL;
    public static String BROWSER_VERSION;
    public static String PLATFORM;
    public static String hubURL;
    public static String GRID_MODE;
    public static String SCENARIO_NAME;
    public static String SCENARIO_NAME1;

    public Constant() {
    }

    public static void loadXmlProperties() throws Exception {
        FrameworkProperties loadProperties = new FrameworkProperties();
        URL congfigFile = null;
        URL driverLocation = null;
        congfigFile = com.automation.qa.ttafuicore.util.Constant.class.getClassLoader().getResource("config/Configuation.properties");
        driverLocation = com.automation.qa.ttafuicore.util.Constant.class.getClassLoader().getResource("drivers/");
        properties = loadProperties.readProjEnvConfig(congfigFile.getPath());

        try {
            DRIVER_LOCATION = properties.getProperty("driverLocation") == null ? driverLocation.getPath() + "chromedriver.exe" : driverLocation.getPath() + properties.getProperty("driverLocation");
            DRIVER_TYPE = properties.getProperty("driverType") == null ? "webdriver.chrome.driver" : properties.getProperty("driverType");
            BROWSER_NAME = properties.getProperty("browser") == null ? "chrome" : properties.getProperty("browser");
            URL = properties.getProperty("url");
            TIMEOUT_IMPLICIT = Integer.parseInt(properties.getProperty("implicitWaitTime"));
            BROWSER_VERSION = properties.getProperty("browserVersion");
            PLATFORM = properties.getProperty("platform");
            hubURL = properties.getProperty("hubURL");
            GRID_MODE = properties.getProperty("grid-mode").toLowerCase();
            LOGGER.info("Set up Framework variables");
        } catch (Exception var4) {
            LOGGER.error("Error: Unable to load framework variables ", var4);
        }

    }

    static {
        try {
            loadXmlProperties();
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }
}
