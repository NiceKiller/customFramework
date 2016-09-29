package page.nopcommerce;

import core.SeleniumCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

/**
 * Created by bzawa on 9/29/2016.
 */
public class NotificationBarPage extends AbstractPage {

    private final String NOTIFICATION_CONTENT_LOCATOR_PATH = "//div[@id='bar-notification']//p[@class='content']";

    @FindBy(xpath = NOTIFICATION_CONTENT_LOCATOR_PATH)
    private WebElement notificationContent;

    @FindBy(xpath = "//div[@id='bar-notification']//span[@class='close']")
    private WebElement closeNotificationButton;

    private final By NOTIFICATION_CONTENT_LOCATOR = By.xpath(NOTIFICATION_CONTENT_LOCATOR_PATH);

    public NotificationBarPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public String getNotificationContentText() {
        return getElementText(notificationContent);
    }

    public NotificationBarPage clickCloseNotificationButton() {
        clickElement(closeNotificationButton);
        customWaits.waitForElementIsNotVisible(NOTIFICATION_CONTENT_LOCATOR);
        return this;
    }
}
