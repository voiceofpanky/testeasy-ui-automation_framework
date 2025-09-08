package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import panels.AmazonHeaderPanel;

/**
 * Created by Pankaj Sao on 11/8/2020.
 */
public class AmazonLoginPage extends BasicPage {
    private AmazonHeaderPanel amazonHeaderPanel;

    @FindBy(id = "signInSubmit")
    private WebElement signIn_button;

    /**
     * Initialize AmazonLoginPage elements
     *
     * @param driver
     * @throws Exception
     */
    public AmazonLoginPage(RemoteWebDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
        amazonHeaderPanel = new AmazonHeaderPanel(driver);
    }

    public boolean verify_Current_Page() throws Exception {
        return driver.getCurrentUrl().toLowerCase().contains("/ap/signin?");
    }
}
