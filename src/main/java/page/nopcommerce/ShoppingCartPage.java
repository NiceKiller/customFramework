package page.nopcommerce;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

/**
 * Created by bzawa on 9/29/2016.
 */
public class ShoppingCartPage extends AbstractPage {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "termsofservice")
    private WebElement termsCheckBox;

    public ShoppingCartPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public ShoppingCartPage acceptTerms() {
        clickElement(termsCheckBox);
        return this;
    }

    public ShoppingCartPage clickCheckoutButton() {
        clickElement(checkoutButton);
        return this;
    }
}
