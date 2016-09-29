package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.OsCheck;

import java.util.concurrent.TimeUnit;

/**
 * Created by bzawa on 9/28/2016.
 */
public class WebDriverCreators {

    private static final Dimension WINDOW_SIZE_PC = new Dimension(1920, 955);

    private WebDriverCreators() {
    }

    public static final WebDriverCreator FIREFOX = () -> {
        checkOsAndSetSystemProperty();
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        setDefaultSettings(driver);
        return driver;
    };

    public static final WebDriverCreator DEFAULT = FIREFOX;

    public static final WebDriverCreator CHROME = () -> {
        checkOsAndSetSystemProperty();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        ChromeDriver driver = new ChromeDriver(options);
        setDefaultSettings(driver);
        return driver;
    };

    private static void setDefaultSettings(WebDriver driver) {
        driver.manage().window().setSize(WINDOW_SIZE_PC);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    private static String checkOsAndSetSystemProperty() {
        String path = null;
        OsCheck.OSType osType = OsCheck.getOperatingSystemType();
        switch (osType) {
            case Windows:
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chrome\\chromedriver_win.exe");
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\gecko\\geckodriver_win.exe");
                break;
            case Linux:
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chrome\\chromedriver_linux.exe");
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\gecko\\geckodriver_linux.exe");
                break;
            case MacOS:
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chrome\\chromedriver_mac.exe");
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\gecko\\geckodriver_mac.exe");
                break;
        }

        return path;
    }

}
