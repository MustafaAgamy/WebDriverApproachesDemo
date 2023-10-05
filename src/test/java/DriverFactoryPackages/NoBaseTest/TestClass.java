package DriverFactoryPackages.NoBaseTest;

import DriverFactoryPackages.Factory.DriverFactory;
import DriverFactoryPackages.PagesConstructor.DriverFactoryHome;
import DriverFactoryPackages.PagesConstructor.DriverFactorySearch;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * TestClass when using DriverFactory approach to set Driver no options.
 */

public class TestClass {


    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected DriverFactoryStaticObjs staticPageObjectsClass;

    @BeforeMethod
    public void setUp(){
        driver.set(DriverFactory.getChromeDriver());
        driver.get().manage().window().maximize();
        driver.get().navigate().to("https://demo.nopcommerce.com/");
        staticPageObjectsClass = new DriverFactoryStaticObjs(driver.get());
    }
    @Test
    public void testDemoConstructors(){

        new DriverFactoryStaticHome(driver.get()).clickOnLoginBtn();
        new DriverFactoryStaticLogin(driver.get()).fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testDemoStatic(){
        staticPageObjectsClass.goHome().clickOnLoginBtn();
        staticPageObjectsClass.goLogin().fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testSearch1(){
        new DriverFactoryHome(driver.get()).sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                new DriverFactorySearch(driver.get()).getSearchOutputs(),
                0,"No Search Results Match the Input");
    }

    @Test
    public void testSearch2(){
        staticPageObjectsClass.goHome().sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                staticPageObjectsClass.goSearch().getSearchOutputs(),0,
                "No Search Results Match the Input");
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.get().quit();
        }
    }
}
