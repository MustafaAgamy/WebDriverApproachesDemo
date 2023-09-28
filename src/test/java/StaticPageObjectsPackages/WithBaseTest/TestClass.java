package StaticPageObjectsPackages.WithBaseTest;

import StaticPageObjectsPackages.Pages.StaticObjects;
import org.testng.annotations.Test;

/**
 * TestClass inheriting BaseTest when using StaticPage Objects Access approach.
 */
public class TestClass extends BaseTest {

    @Test
    public void testDemo(){
        StaticObjects.goHome().clickOnLoginBtn();
        StaticObjects.goLogin().fillLoginData("","").clickConfLoginBtn();

    }
}
