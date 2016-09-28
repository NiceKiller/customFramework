package page.manager;

import core.SeleniumCore;
import page.MainMenuPage;
import page.RegistrationPage;

/**
 * Created by bzawa on 9/28/2016.
 */
public class PageObjectManager {

    private SeleniumCore seleniumCore;
    private MainMenuPage mainMenuPage;
    private RegistrationPage registrationPage;

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
}
