package page;

import core.SeleniumCore;
import data.enums.Gender;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by bzawa on 9/28/2016.
 */
public class RegistrationPage extends AbstractPage {

    @FindBy(id = "gender-male")
    private WebElement maleCheckBox;

    @FindBy(id = "gender-female")
    private WebElement femaleCheckBox;

    @FindBy(id = "FirstName")
    private WebElement firstNameInput;

    @FindBy(id = "LastName")
    private WebElement lastNameInput;

    @FindBy(name = "DateOfBirthDay")
    private WebElement dateOfBirthDaySelect;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement dateOfBirthMonthSelect;

    @FindBy(name = "DateOfBirthYear")
    private WebElement dateOfBirthYearSelect;

    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "Company")
    private WebElement companyInput;

    @FindBy(id = "Newsletter")
    private WebElement newsletterCheckBox;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordInput;

    @FindBy(id = "register-button")
    private WebElement confirmRegistartionButton;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement afterRegistrationMessage;

    @FindBy(name = "register-continue")
    private WebElement continueRegistrationButton;

    public RegistrationPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public RegistrationPage selectGender(Gender gender) {
        switch (gender) {
            case MALE:
                clickElement(maleCheckBox);
                break;
            case FEMALE:
                clickElement(femaleCheckBox);
                break;
        }
        return this;
    }

    public RegistrationPage enterTextInFirstNameInput(String text) {
        sendKeys(firstNameInput, text);
        return this;
    }

    public RegistrationPage enterTextInLastNameInput(String text) {
        sendKeys(lastNameInput, text);
        return this;
    }

    public RegistrationPage selectDayOfBirth(String value) {
        setValueFromSelect(dateOfBirthDaySelect, value);
        return this;
    }

    public RegistrationPage selectMonthOfBirth(String value) {
        setValueFromSelect(dateOfBirthMonthSelect, value);
        return this;
    }

    public RegistrationPage selectYearOfBirth(String value) {
        setValueFromSelect(dateOfBirthYearSelect, value);
        return this;
    }

    public RegistrationPage eneterTextInEmailInput(String text) {
        sendKeys(emailInput, text);
        return this;
    }

    public RegistrationPage eneterTextInCompanyInput(String text) {
        sendKeys(companyInput, text);
        return this;
    }

    public RegistrationPage clickNewsletterCheckBox() {
        clickElement(newsletterCheckBox);
        return this;
    }

    public RegistrationPage enterTextInPasswordAndConfirmPasswordInput(String text) {
        sendKeys(passwordInput, text);
        sendKeys(confirmPasswordInput, text);
        return this;
    }

    public RegistrationPage confirmRegistration(){
        clickElement(confirmRegistartionButton);
        return this;
    }

    public String getAfterRegistrationMessage() {
        return getElementText(afterRegistrationMessage);
    }

    public void clickContinueRegistrationButton(){
        clickElement(continueRegistrationButton);
    }

}
