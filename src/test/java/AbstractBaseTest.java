import core.SeleniumCore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

/**
 * Created by bzawa on 9/28/2016.
 */
public class AbstractBaseTest {

    protected SeleniumCore driver;
    public final static String BaseURL = "http://google.com";

    @Parameters("browser")
    @BeforeTest
    public void beforeSuite(String browser) {
        driver = new SeleniumCore(browser);
        driver.navigate(BaseURL);
    }

    @AfterTest
    public void afterSuite() {
        driver.driverClose();
    }
}
