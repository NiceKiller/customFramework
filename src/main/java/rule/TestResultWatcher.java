package rule;

import core.SeleniumCore;
import helper.ScreenshotHelper;
import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static com.google.common.io.Files.toByteArray;
import static utils.TestDescription.getSimpleMethodName;

/**
 * Created by Bartlomiej_Zawadzki on 9/29/2016.
 */
public class TestResultWatcher extends TestWatcher {

    private static final Logger LOG = LoggerFactory.getLogger(TestResultWatcher.class);

    private SeleniumCore seleniumCore;
    private ScreenshotHelper screenshotHelper;

    public void setSeleniumCore(SeleniumCore seleniumCore) {
        this.seleniumCore = seleniumCore;
    }

    @Override
    protected void failed(Throwable e, Description description) {
        screenshotHelper = new ScreenshotHelper();
        screenshotHelper.takeScreenShotOnFailure(description, seleniumCore);
    }

    @Override
    protected void finished(Description description) {
        if (this.seleniumCore.getWebDriver() != null) {
            try {
                this.seleniumCore.getWebDriver().quit();
            } catch (WebDriverException e) {
                this.failed(e, description);
            }
        }

    }


}
