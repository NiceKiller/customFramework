package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by bzawa on 9/28/2016.
 */
public class WebDriverCreators {

    private static final Dimension WINDOW_SIZE_PC = new Dimension(1920, 955);

    public static final WebDriverCreator FIREFOX = new WebDriverCreator() {
        @Override
        public WebDriver create() {
            WebDriver driver = new FirefoxDriver();
            setDefaultSettings(driver, WINDOW_SIZE_PC);
            return driver;
        }

    };

    public static final WebDriverCreator DEFAULT = FIREFOX;

    public static final WebDriverCreator CHROME = new WebDriverCreator() {
        @Override
        public WebDriver create() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en");
            options.setBinary("src/main/resources/drivers/chromedriver_win.exe");
            ChromeDriver driver = new ChromeDriver(options);
            setDefaultSettings(driver, WINDOW_SIZE_PC);
            return driver;
        }

    };

    private static void setDefaultSettings(WebDriver driver, Dimension dimension) {
        driver.manage().window().setSize(dimension);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

}
