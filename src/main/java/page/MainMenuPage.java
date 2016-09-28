package page;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by bzawa on 9/28/2016.
 */
public class MainMenuPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(@href,'register')]")
    WebElement registrationButton;

    public MainMenuPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public void clickRegistrationButton(){
        clickElement(registrationButton);
    }


}
