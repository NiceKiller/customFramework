package rule;

import core.SeleniumCore;
import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Bartlomiej_Zawadzki on 9/29/2016.
 */
public class TestResultWatcher extends TestWatcher {

    private static final Logger LOG = LoggerFactory.getLogger(TestResultWatcher.class);

    private SeleniumCore seleniumCore;

    public void setSeleniumCore(SeleniumCore seleniumCore) {
        this.seleniumCore = seleniumCore;
    }

    @Override
    protected void failed(Throwable e, Description description) {
        takeScreenShotOnFailure(description);
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

    public void takeScreenShotOnFailure(Description description) {
        File screenshoot = null;
        File scrFile = ((TakesScreenshot) seleniumCore.getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, screenshoot = new File(getScreenShotFilePath(description)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.info(screenshoot.getAbsolutePath());
    }

    private String getScreenShotFilePath(Description description) {
        return "target\\screenshot\\" + getScreenShotName(description) + ".jpg";
    }

    private String getScreenShotName(Description description) {
        return description.getMethodName() + "_" + new Date().getTime();
    }

}
