package PageConstructorsPackages.NoBaseTest;

import PageConstructorsPackages.Pages.PageConstructorsHome;
import PageConstructorsPackages.Pages.PageConstructorsLogin;
import PageConstructorsPackages.Pages.PageConstructorsSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * TestClass when using PageConstructors Access approach.
 */
public class TestClass {

    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @Test
    public void testDemo(){
        new PageConstructorsHome(driver).clickOnLoginBtn();
        new PageConstructorsLogin(driver).fillLoginData("","").clickConfLoginBtn();
    }

    @Test
    public void testSearch(){
        new PageConstructorsHome(driver).sendInputAndClickSearch("Laptop");
        Assert.assertNotEquals(
                new PageConstructorsSearch(driver).getSearchOutputs(),0
                ,"No Search Results Match the Input");
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
