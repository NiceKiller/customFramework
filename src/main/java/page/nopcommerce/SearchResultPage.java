package page.nopcommerce;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

/**
 * Created by bzawa on 9/29/2016.
 */
public class SearchResultPage extends AbstractPage{

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(@href,'/htc-one-mini-blue')]")
    private WebElement firstItemLabel;

    @FindBy(xpath = "//input[@value='Add to cart']")
    private WebElement addToCartButton;

    public SearchResultPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public String getFirstItemLabelText() {
        return getElementText(firstItemLabel);
    }

    public SearchResultPage clickAddToCart() {
        clickElement(addToCartButton);
        return this;
    }
}
