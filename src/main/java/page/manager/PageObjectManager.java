package page.manager;

import core.SeleniumCore;
import page.MainMenuPage;

/**
 * Created by bzawa on 9/28/2016.
 */
public class PageObjectManager {

    private SeleniumCore seleniumCore;
    private MainMenuPage mainMenuPage;

    public PageObjectManager(SeleniumCore seleniumCore) {
        this.seleniumCore = seleniumCore;
    }

    public MainMenuPage getMainMenuPage() {
        if (mainMenuPage == null) {
            mainMenuPage = new MainMenuPage(seleniumCore);
        }
        return mainMenuPage;
    }
}
