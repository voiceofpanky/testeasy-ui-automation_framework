package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import panels.AmazonHeaderPanel;

/**
 * Created by Pankaj Sao on 11/7/2020.
 */
public class OfferListingPage extends BasicPage {

    private AmazonHeaderPanel amazonHeaderPanel;

    @FindBy(className = "a-button-input")
    private WebElement add_to_cart_button;

    /**
     * Initialize OfferListingPage elements
     *
     * @param driver
     * @throws Exception
     */
    public OfferListingPage(RemoteWebDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
        amazonHeaderPanel = new AmazonHeaderPanel(driver);
    }

    public boolean verify_Current_Page() throws Exception {
        return driver.getCurrentUrl().toLowerCase().contains("/gp/offer-listing/");
    }

    public void add_to_cart_button() throws Exception {
        add_to_cart_button.click();
    }

}
