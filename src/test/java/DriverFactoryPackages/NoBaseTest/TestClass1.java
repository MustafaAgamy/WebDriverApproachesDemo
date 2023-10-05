package DriverFactoryPackages.NoBaseTest;

import DriverFactoryPackages.Factory.DriverFactory;
import DriverFactoryPackages.PagesConstructor.DriverFactoryHome;
import DriverFactoryPackages.PagesConstructor.DriverFactorySearch;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * TestClass when using DriverFactory approach to set Driver with options.
 */
public class TestClass1 {

    protected DriverFactoryStaticObjs staticPageObjectsClass;

    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = DriverFactory.getChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        staticPageObjectsClass = new DriverFactoryStaticObjs(driver);

    }
    @Test
    public void testDemoConstructors(){

        new DriverFactoryStaticHome(driver).clickOnLoginBtn();
        new DriverFactoryStaticLogin(driver).fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testDemoStatic(){
        staticPageObjectsClass.goHome().clickOnLoginBtn();
        staticPageObjectsClass.goLogin().fillLoginData("","").clickConfLoginBtn();
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
        staticPageObjectsClass.goHome().sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                staticPageObjectsClass.goSearch().getSearchOutputs(),0,
                "No Search Results Match the Input");
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
