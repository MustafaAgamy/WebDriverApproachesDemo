package DriverFactoryPackages.WithBaseTest;

import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void testDemoConstructors(){
        new DriverFactoryStaticHome(driver).clickOnLoginBtn();
        new DriverFactoryStaticLogin(driver).fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testDemoStatic(){
        DriverFactoryStaticObjs.goHome().clickOnLoginBtn();
        DriverFactoryStaticObjs.goLogin().fillLoginData("","").clickConfLoginBtn();
    }
}
