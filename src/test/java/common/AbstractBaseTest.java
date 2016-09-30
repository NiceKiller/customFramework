package common;

import core.SeleniumCore;
import org.junit.Before;
import org.junit.Rule;
import rule.TestResultWatcher;
import utils.SystemProperties;

/**
 * Created by bzawa on 9/28/2016.
 */
public class AbstractBaseTest {

    @Rule
    public TestResultWatcher testResultWatcher;

    public final static String BaseURL = "http://demo.nopcommerce.com/";
    protected SeleniumCore driver;

    public AbstractBaseTest() {
        testResultWatcher = new TestResultWatcher();
    }

    @Before
    public void prepare() {
        driver = new SeleniumCore(SystemProperties.getBrowserProperty());
        testResultWatcher.setSeleniumCore(driver);
        driver.navigate(BaseURL);
    }

}
