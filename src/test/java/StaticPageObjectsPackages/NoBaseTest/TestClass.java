package StaticPageObjectsPackages.NoBaseTest;

import StaticPageObjectsPackages.Pages.StaticObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
