package DriverFactoryPackages.WithBaseTest;

import DriverFactoryPackages.PagesConstructor.DriverFactoryHome;
import DriverFactoryPackages.PagesConstructor.DriverFactoryLogin;
import DriverFactoryPackages.PagesConstructor.DriverFactorySearch;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void testDemoConstructors(){
        new DriverFactoryHome(driver).clickOnLoginBtn();
        new DriverFactoryLogin(driver).fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testDemoStatic(){
        pageObjects.goHome().clickOnLoginBtn();
        pageObjects.goLogin().fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testSearch1(){
                new DriverFactoryHome(driver).sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                new DriverFactorySearch(driver).getSearchOutputs(),
                0,"No Search Results Match the Input");
    }

    @Test
    public void testSearch2(){
        pageObjects.goHome().sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
          pageObjects.goSearch().getSearchOutputs(),0,
                "No Search Results Match the Input");
    }
}
