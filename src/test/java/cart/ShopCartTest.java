package cart;

import common.AbstractBaseTest;
import data.enums.Gender;
import org.junit.Before;
import org.junit.Test;
import page.manager.PageObjectManager;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by bzawa on 9/28/2016.
 */
public class ShopCartTest extends AbstractBaseTest {

    private PageObjectManager manager;

    @Before
    public void setUp() {
        manager = new PageObjectManager(driver);
    }

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
                .isEqualToIgnoringCase("Your registration completed1");

        manager.getRegistrationPage().clickContinueRegistrationButton();

        assertThat(manager.getMainMenuPage().getCustomerInformationLabelText()).as("Check if logged in user")
                .isEqualToIgnoringCase(random + "email@mailinator.com");

        Thread.sleep(5000);

    }
}
