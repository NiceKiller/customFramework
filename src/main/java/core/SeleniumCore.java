package core;

import data.enums.Browsers;
import driver.WebDriverCreators;
import driver.WebDriverProvider;
import org.openqa.selenium.WebDriver;


/**
 * Created by bzawa on 9/28/2016.
 */
public class SeleniumCore {

    private WebDriver driver;

    public SeleniumCore(Browsers browser) {
        if (browser.equals(Browsers.FIREFOX)) {
            driver = new WebDriverProvider(WebDriverCreators.FIREFOX).getDriver();
        }
        if (browser.equals(Browsers.CHROME)) {
            driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        }
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void navigate(String URL) {
        driver.get(URL);
    }
}
