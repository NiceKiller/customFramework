package page;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import wait.CustomWaits;


/**
 * Created by bzawa on 9/28/2016.
 */
public abstract class AbstractPage {

    protected CustomWaits customWaits;
    protected SeleniumCore seleniumCore;

    protected AbstractPage(SeleniumCore seleniumCore) {
        this.seleniumCore = seleniumCore;
        customWaits = new CustomWaits(seleniumCore.getWebDriver());
        initPage();
    }

    private void initPage() {
        PageFactory.initElements(seleniumCore.getWebDriver(), this);
    }

    public void clickElement(WebElement webElement){
        customWaits.waitForElementPresent(webElement);
        webElement.click();
    }

}
