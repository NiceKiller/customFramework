package wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by bzawa on 9/27/2016.
 */
public class CustomWaits {

    private WebDriver driver;
    private int globalWaitTime;

    public CustomWaits(WebDriver driver) {
        this.driver = driver;
        this.globalWaitTime = 10;
    }

    public WebElement waitForElementPresent(final WebElement element) {
        return waitForElementPresent(element, globalWaitTime);
    }

    private WebElement waitForElementPresent(final WebElement element, final int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
