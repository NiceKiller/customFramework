package cart;

import common.AbstractBaseTest;
import data.enums.Gender;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.manager.PageObjectManager;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by bzawa on 9/28/2016.
 */
public class ShopCartTest extends AbstractBaseTest {

    private PageObjectManager manager;

    @BeforeTest
    public void setUp() {
        manager = new PageObjectManager(driver);
    }

    @Test
    public void baseTest() throws InterruptedException {
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

        Thread.sleep(5000);

    }
}
