package core;

import driver.WebDriverCreators;
import driver.WebDriverProvider;
import org.openqa.selenium.WebDriver;

import java.util.Optional;


/**
 * Created by bzawa on 9/28/2016.
 */
public class SeleniumCore {

    private WebDriver driver;

    public SeleniumCore(String browser) {
        Optional<String> browserOptional = Optional.of(browser);

        if (browserOptional.isPresent() == false || browserOptional.get().equalsIgnoreCase("firefox")) {
            driver = new WebDriverProvider(WebDriverCreators.FIREFOX).getDriver();
        } else if (browserOptional.get().equalsIgnoreCase("chrome")) {
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
        driver.get(URL);
    }
}
