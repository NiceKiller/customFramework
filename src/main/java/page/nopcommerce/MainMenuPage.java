package page.nopcommerce;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

/**
 * Created by bzawa on 9/28/2016.
 */
public class MainMenuPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(@href,'register')]")
    private WebElement registrationButton;

    @FindBy(xpath = "//span[@class='cart-label']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//a[contains(@href,'/customer/info')]")
    private WebElement customerInformationLabel;

    @FindBy(id = "small-searchterms")
    private WebElement searchInput;

    @FindBy(xpath = "//input[@class='button-1 search-box-button']")
    private WebElement confirmSearchButton;


    public MainMenuPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public void clickRegistrationButton(){
        clickElement(registrationButton);
    }

    public String getCustomerInformationLabelText(){
        return getElementText(customerInformationLabel);
    }

    public MainMenuPage searchItem(String text) {
        sendKeys(searchInput, text);
        clickElement(confirmSearchButton);
        return this;
    }

    public MainMenuPage openShoppingCart() {
        clickElement(shoppingCartButton);
        return this;
    }

}
