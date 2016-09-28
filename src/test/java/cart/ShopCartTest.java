package cart;

import common.AbstractBaseTest;
import org.junit.Before;
import org.testng.annotations.Test;
import page.manager.PageObjectManager;

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
    public void baseTest() {
        manager.getMainMenuPage().clickRegistrationButton();
    }
}
