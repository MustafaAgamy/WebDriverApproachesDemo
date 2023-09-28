package DriverFactoryPackages.NoBaseTest;

import DriverFactoryPackages.Factory.DriverFactory;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.openqa.selenium.WebDriver;
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
        DriverFactoryStaticObjs.goHome().clickOnLoginBtn();
        DriverFactoryStaticObjs.goLogin().fillLoginData("","").clickConfLoginBtn();
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.get().quit();
        }
    }
}
