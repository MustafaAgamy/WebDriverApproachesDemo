package PageConstructorsPackages.WithBaseTest;

import CommonPackages.WithBaseTest.Pages.BaseTestHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 class BaseTest {

    protected WebDriver driver;
    protected BaseTestHome baseTestHome;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
