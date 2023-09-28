package DriverFactoryPackages.WithBaseTest;

import DriverFactoryPackages.Factory.DriverFactory;
import DriverFactoryPackages.PagesStatic.DriverFactoryStaticObjs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * BaseTest when using DriverFactory approach to set Driver with no options.
 */
 class BaseTest {

    protected WebDriver driver;
    DriverFactoryStaticObjs pageObjects;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        pageObjects = new DriverFactoryStaticObjs(driver);
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
