package PageConstructorsPackages.WithBaseTest;

import PageConstructorsPackages.Pages.PageConstructorsHome;
import PageConstructorsPackages.Pages.PageConstructorsLogin;
import PageConstructorsPackages.Pages.PageConstructorsSearch;
import org.testng.Assert;
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

    @Test
    public void testSearch(){
        new PageConstructorsHome(driver).sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
        new PageConstructorsSearch(driver).getSearchOutputs(),0
                ,"No Search Results Match the Input");
    }
}