package page.nopcommerce;

import core.SeleniumCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

/**
 * Created by bzawa on 9/29/2016.
 */
public class CheckoutPage extends AbstractPage {

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countrySelect;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement addressInput;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement postalCodeInput;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@title='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
    private WebElement continueShippingButton;

    @FindBy(xpath = "//img[@alt='Credit Card']")
    private WebElement creditCardImage;

    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    private WebElement continuePaymentButton;

    @FindBy(id = "CardholderName")
    private WebElement cardHolderNameInput;

    @FindBy(id = "CardNumber")
    private WebElement cardNumberInput;

    @FindBy(id = "ExpireMonth")
    private WebElement expireMonthSelect;

    @FindBy(id = "ExpireYear")
    private WebElement expireYearSelect;

    @FindBy(id = "CardCode")
    private WebElement cardCodeInput;

    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    private WebElement continuePaymentInfoButton;

    @FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
    private WebElement confirmCheckoutButton;

    @FindBy(xpath = "//div[@class='section order-completed']/div/strong")
    private WebElement sucessfulOrderConfirmationMessage;

    public CheckoutPage(SeleniumCore seleniumCore) {
        super(seleniumCore);
    }

    public CheckoutPage selectCountry(String country) {
        setTextFromSelect(countrySelect, country);
        return this;
    }

    public CheckoutPage enterTextInCityInput(String text) {
        sendKeys(cityInput, text);
        return this;
    }

    public CheckoutPage enterTextInAddresInput(String text) {
        sendKeys(addressInput, text);
        return this;
    }

    public CheckoutPage enterTextInPostalCodeInput(String text) {
        sendKeys(postalCodeInput, text);
        return this;
    }

    public CheckoutPage enterTextInPhoneInput(String text) {
        sendKeys(phoneNumberInput, text);
        return this;
    }

    public CheckoutPage clickContinue() {
        clickElement(continueButton);
        return this;
    }

    public CheckoutPage clickContinueShipping() {
        clickElement(continueShippingButton);
        return this;
    }

    public CheckoutPage clickCreditCardImage() {
        clickElement(creditCardImage);
        return this;
    }

    public CheckoutPage clickContinuePayment() {
        clickElement(continuePaymentButton);
        return this;
    }

    public CheckoutPage enterTextInCardHolderName(String text) {
        sendKeys(cardHolderNameInput, text);
        return this;
    }

    public CheckoutPage enterTextInCardNumberInput(String text) {
        sendKeys(cardNumberInput, text);
        return this;
    }

    public CheckoutPage selectCardExpirationDate(String month, String year) {
        setValueFromSelect(expireMonthSelect, month);
        setValueFromSelect(expireYearSelect, year);
        return this;
    }

    public CheckoutPage enterTextInCardCodeInput(String text) {
        sendKeys(cardCodeInput, text);
        return this;
    }

    public CheckoutPage clickConfirmPaymentInfoButton() {
        clickElement(continuePaymentInfoButton);
        return this;
    }

    public CheckoutPage clickConfirmCheckouProcessButton() {
        clickElement(confirmCheckoutButton);
        return this;
    }

    public String getOrderConfirmationMessage() {
        return getElementText(sucessfulOrderConfirmationMessage);
    }

}
