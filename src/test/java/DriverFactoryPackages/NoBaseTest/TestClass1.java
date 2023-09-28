package DriverFactoryPackages.NoBaseTest;

import DriverFactoryPackages.Factory.DriverFactory;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticHome;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticLogin;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        DriverFactoryStaticObjs.goHome().clickOnLoginBtn();
        DriverFactoryStaticObjs.goLogin().fillLoginData("","").clickConfLoginBtn();
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
