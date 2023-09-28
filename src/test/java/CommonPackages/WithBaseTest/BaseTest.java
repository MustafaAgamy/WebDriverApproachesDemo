package CommonPackages.WithBaseTest;

import CommonPackages.WithBaseTest.Pages.BaseTestHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 class BaseTest {

    protected WebDriver driver;
    protected BaseTestHome baseTestHome;

     /**
      * 1- The most common approach for setting your WebDriver is through  a BestTest Class.
      * 2- This class will be inherited by the test classes.
      * 3- You will pass the driver to your Page Objects.
      * 4- You can initialize your PageObject here or at your test class but make sure to pass the driver correctly.
      * Pros: it will save repeating your driver setup/teardown logic.
      * Cons: it can cause some issue with your driver encapsulation.
      */

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

        baseTestHome = new BaseTestHome(driver);
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
