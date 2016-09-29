package cart;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import common.AbstractBaseTest;
import data.enums.Gender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.manager.PageObjectManager;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by bzawa on 9/28/2016.
 */
@RunWith(DataProviderRunner.class)
public class ShopCartTest extends AbstractBaseTest {

    private PageObjectManager manager;

    @Before
    public void setUp() {
        manager = new PageObjectManager(driver);
    }

    @UseDataProvider(value = "dataProviderClientTypesForTransferChips", location = TransferChipsDataProviders.class)
    @Test
    public void shopCartTest() throws InterruptedException {
        UUID random = UUID.randomUUID();

        manager.getMainMenuPage()
                .clickRegistrationButton();

        manager.getRegistrationPage()
                .selectGender(Gender.MALE)
                .enterTextInFirstNameInput("Name")
                .enterTextInLastNameInput("Last")
                .selectDayOfBirth("1")
                .selectMonthOfBirth("1")
                .selectYearOfBirth("1989")
                .eneterTextInEmailInput(random + "email@mailinator.com")
                .eneterTextInCompanyInput("arForce")
                .clickNewsletterCheckBox()
                .enterTextInPasswordAndConfirmPasswordInput("password")
                .confirmRegistration();

        assertThat(manager.getRegistrationPage().getAfterRegistrationMessage()).as("Check if registration was successful")
                .isEqualToIgnoringCase("Your registration completed");

        manager.getRegistrationPage().clickContinueRegistrationButton();

        assertThat(manager.getMainMenuPage().getCustomerInformationLabelText()).as("Check if logged in user")
                .isEqualToIgnoringCase(random + "email@mailinator.com");

        manager.getMainMenuPage().searchItem("HTC One Mini Blue");

        assertThat(manager.getSearchResultPage().getFirstItemLabelText()).as("Check if item was found")
                .isEqualToIgnoringCase("HTC One Mini Blue");

        manager.getSearchResultPage().clickAddToCart();

        assertThat(manager.getNotificationBarPage().getNotificationContentText()).as("Check if it was successfully added to cart")
                .isEqualToIgnoringCase("The product has been added to your shopping cart");

        manager.getNotificationBarPage().clickCloseNotificationButton();
        manager.getMainMenuPage().openShoppingCart();
        manager.getShoppingCartPage().acceptTerms().clickCheckoutButton();

        manager.getCheckoutPage()
                .selectCountry("Poland")
                .enterTextInCityInput("Gdansk")
                .enterTextInAddresInput("some address 12")
                .enterTextInPostalCodeInput("80000")
                .enterTextInPhoneInput("500500500")
                .clickContinue()
                .clickContinueShipping()
                .clickCreditCardImage()
                .clickContinuePayment()
                .enterTextInCardHolderName("dupa")
                .enterTextInCardNumberInput("4012888888881881")
                .selectCardExpirationDate("12","2018")
                .enterTextInCardCodeInput("111")
                .clickConfirmPaymentInfoButton()
                .clickConfirmCheckouProcessButton();

        assertThat(manager.getCheckoutPage().getOrderConfirmationMessage()).as("Check if order was successfully proceeded")
                .isEqualToIgnoringCase("Your order has been successfully processed!");

        Thread.sleep(3000);

    }
}
