package PageConstructorsPackages.WithBaseTest;

import PageConstructorsPackages.Pages.PageConstructorsHome;
import PageConstructorsPackages.Pages.PageConstructorsLogin;
import org.testng.annotations.Test;

/**
 * TestClass inheriting BaseTest when using PageConstructors Access approach.
 */
public class TestClass extends BaseTest {

        @Test
    public void testDemo(){
            new PageConstructorsHome(driver).clickOnLoginBtn();
            new PageConstructorsLogin(driver).fillLoginData("","").clickConfLoginBtn();
        }
}