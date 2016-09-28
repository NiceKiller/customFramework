package core;

import driver.WebDriverCreators;
import driver.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


/**
 * Created by bzawa on 9/28/2016.
 */
public class SeleniumCore {

    private WebDriver driver;

    public SeleniumCore(String browser) {

        if(browser.equalsIgnoreCase("firefox")){
            driver = new WebDriverProvider(WebDriverCreators.FIREFOX).getDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        }
    }

    public void driverClose() {
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void navigate(String URL) {
        Reporter.log("Opening " + URL);
        driver.get(URL);
    }
}
