package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import panels.AmazonHeaderPanel;

/**
 * Created by Pankaj Sao on 11/8/2020.
 */
public class AddCartPage extends BasicPage {
    private WebDriverWait wait = new WebDriverWait(driver, 100);
    public AmazonHeaderPanel amazonHeaderPanel;

    @FindBy(css = "input.a-button-input")
    private WebElement proceed_to_checkout_button;

    /**
     * Initialize AddCartPage elements
     *
     * @param driver
     * @throws Exception
     */
    public AddCartPage(RemoteWebDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
        amazonHeaderPanel = new AmazonHeaderPanel(driver);
    }

    public void click_proceed_to_checkout() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(proceed_to_checkout_button));
        proceed_to_checkout_button.click();
    }
}
