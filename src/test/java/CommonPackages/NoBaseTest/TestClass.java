package CommonPackages.NoBaseTest;

import CommonPackages.NoBaseTest.Pages.NoBaseTestHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * When using TestClass without Inheriting the most straightforward way to Setup your drivers will be in the testClass itself.
 * Pros: but it will ensure each driver instance is assigned for one test class achieving better encapsulation.
 * Cons: can be a bit repeatable.
 */

public class TestClass {

    private WebDriver driver;
    protected NoBaseTestHome homePage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        homePage = new NoBaseTestHome(driver);
    }

    @Test
    public void testDemo(){
        homePage.clickOnRegisterBtn();
    }

    @Test
    public void test2(){
        Assert.assertNotEquals(
                homePage.
                        sendInputAndClickSearch("Laptop").
                        getSearchOutputs(),0,"No Search Results Match the Input");
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
