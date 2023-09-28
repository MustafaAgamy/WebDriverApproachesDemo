package StaticPageObjectsPackages.NoBaseTest;

import StaticPageObjectsPackages.Pages.StaticObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * TestClass when using StaticPage Objects Access approach.
 */
public class TestClass {

    private WebDriver driver;
    protected StaticObjects pageObjects;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        pageObjects = new StaticObjects(driver);
    }


    @Test
    public void testDemo(){
       StaticObjects.goHome().clickOnLoginBtn();
       StaticObjects.goLogin().fillLoginData("","").clickConfLoginBtn();
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
