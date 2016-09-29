package page.manager;

import core.SeleniumCore;
import page.nopcommerce.*;

/**
 * Created by bzawa on 9/28/2016.
 */
public class PageObjectManager {

    private SeleniumCore seleniumCore;
    private MainMenuPage mainMenuPage;
    private RegistrationPage registrationPage;
    private SearchResultPage searchResultPage;
    private NotificationBarPage notificationBarPage;
    private ShoppingCartPage shoppingCartPage;
    private CheckoutPage checkoutPage;

    public PageObjectManager(SeleniumCore seleniumCore) {
        this.seleniumCore = seleniumCore;
    }

    public MainMenuPage getMainMenuPage() {
        if (mainMenuPage == null) {
            mainMenuPage = new MainMenuPage(seleniumCore);
        }
        return mainMenuPage;
    }

    public RegistrationPage getRegistrationPage() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage(seleniumCore);
        }
        return registrationPage;
    }

    public SearchResultPage getSearchResultPage() {
        if (searchResultPage == null) {
            searchResultPage = new SearchResultPage(seleniumCore);
        }
        return searchResultPage;
    }

    public NotificationBarPage getNotificationBarPage() {
        if (notificationBarPage == null) {
            notificationBarPage = new NotificationBarPage(seleniumCore);
        }
        return notificationBarPage;
    }

    public ShoppingCartPage getShoppingCartPage() {
        if (shoppingCartPage == null) {
            shoppingCartPage = new ShoppingCartPage(seleniumCore);
        }
        return shoppingCartPage;
    }

    public CheckoutPage getCheckoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage(seleniumCore);
        }
        return checkoutPage;
    }
}
