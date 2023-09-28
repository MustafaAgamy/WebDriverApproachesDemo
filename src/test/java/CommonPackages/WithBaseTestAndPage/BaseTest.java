package CommonPackages.WithBaseTestAndPage;

import CommonPackages.WithBaseTestAndPage.Pages.BaseTestAndPageHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 class BaseTest {

    protected WebDriver driver;
    protected BaseTestAndPageHome baseTestAndPageHome;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

        baseTestAndPageHome = new BaseTestAndPageHome(driver);
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
