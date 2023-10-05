package StaticPageObjectsPackages.WithBaseTest;

import StaticPageObjectsPackages.Pages.StaticObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TestClass inheriting BaseTest when using StaticPage Objects Access approach.
 */
public class TestClass extends BaseTest {

    @Test
    public void testDemo(){
        pageObjects.goHome().clickOnLoginBtn();
        pageObjects.goLogin().fillLoginData("","").clickConfLoginBtn();

    }

    @Test
    public void testSearch(){
        pageObjects.goHome().sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                pageObjects.goSearch().getSearchOutputs(),0
                ,"No Search Results Match the Input");
    }
}
