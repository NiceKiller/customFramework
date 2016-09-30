package cart;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import common.AbstractBaseTest;
import data.dataProviders.CartTestDataProvider;
import data.dto.AddressData;
import data.dto.PaymentData;
import data.dto.RegistrationData;
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

    @UseDataProvider(value = "cartTestDataProvider", location = CartTestDataProvider.class)
    @Test
    public void shouldRegisterAndBuyItem(RegistrationData registrationDataProvider, String phoneName, AddressData addressDataProvider, PaymentData paymentDataProvider) {
        UUID random = UUID.randomUUID();

        manager.getMainMenuPage()
                .clickRegistrationButton();

        manager.getRegistrationPage().registerAccount(registrationDataProvider.setEmail(random + registrationDataProvider.getEmail()));

        assertThat(manager.getRegistrationPage().getAfterRegistrationMessage()).as("Check if registration was successful")
                .isEqualToIgnoringCase("Your registration completed");

        manager.getRegistrationPage().clickContinueRegistrationButton();

        assertThat(manager.getMainMenuPage().getCustomerInformationLabelText()).as("Check if logged in user email is correct")
                .isEqualToIgnoringCase(registrationDataProvider.getEmail());

        manager.getMainMenuPage().searchItem(phoneName);

        assertThat(manager.getSearchResultPage().getFirstItemLabelText()).as("Check if item was found")
                .isEqualToIgnoringCase(phoneName);

        manager.getSearchResultPage().clickAddToCart();

        assertThat(manager.getNotificationBarPage().getNotificationContentText()).as("Check if it was successfully added to cart")
                .isEqualToIgnoringCase("The product has been added to your shopping cart");

        manager.getNotificationBarPage().clickCloseNotificationButton();
        manager.getMainMenuPage().openShoppingCart();
        manager.getShoppingCartPage().acceptTerms().clickCheckoutButton();

        manager.getCheckoutPage().checkoutWithCreditCardPayment(addressDataProvider, paymentDataProvider);

        assertThat(manager.getCheckoutPage().getOrderConfirmationMessage()).as("Check if order was successfully proceeded")
                .isEqualToIgnoringCase("Your order has been successfully processed!");

    }
}
