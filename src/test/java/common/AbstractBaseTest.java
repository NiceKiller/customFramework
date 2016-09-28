package common;

import core.SeleniumCore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * Created by bzawa on 9/28/2016.
 */
public class AbstractBaseTest {

    protected SeleniumCore driver;
    public final static String BaseURL = "http://demo.nopcommerce.com/";

    @Parameters({"browser"})
    @BeforeTest
    public void beforeSuite(@Optional String browser) {
        System.out.println("BROWSER: " + browser);
        driver = new SeleniumCore(browser);
        driver.navigate(BaseURL);
    }

    @AfterTest
    public void afterSuite() {
        driver.driverClose();
    }
}
