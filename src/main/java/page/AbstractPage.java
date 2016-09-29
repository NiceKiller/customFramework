package page;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

    public void clickElement(WebElement webElement) {
        customWaits.waitForElementBeingClickable(webElement);
        webElement.click();
    }

    public void sendKeys(WebElement webElement, String text) {
        customWaits.waitForElementPresent(webElement);
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void setValueFromSelect(WebElement webElement, String value) {
        customWaits.waitForElementPresent(webElement);
        Select Select = new Select(webElement);
        Select.selectByValue(value);
    }

    public void setTextFromSelect(WebElement webElement, String text) {
        customWaits.waitForElementPresent(webElement);
        Select Select = new Select(webElement);
        Select.selectByVisibleText(text);
    }

    public String getElementText(WebElement webElement) {
        customWaits.waitForElementPresent(webElement);
        return webElement.getText();
    }

}
