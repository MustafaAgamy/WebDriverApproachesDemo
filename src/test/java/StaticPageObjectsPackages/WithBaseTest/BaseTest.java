package StaticPageObjectsPackages.WithBaseTest;

import StaticPageObjectsPackages.Pages.StaticObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 class BaseTest {

    private WebDriver driver;
    protected StaticObjects pageObjects;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        pageObjects = new StaticObjects(driver);
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
