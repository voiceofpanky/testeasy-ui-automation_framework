
package pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicPage {
   private static final Logger LOGGER = Logger.getLogger(String.valueOf(BasicPage.class));
   protected RemoteWebDriver driver;

   public BasicPage() {
   }

   public BasicPage(RemoteWebDriver driver) {
      this.driver = driver;
   }
}