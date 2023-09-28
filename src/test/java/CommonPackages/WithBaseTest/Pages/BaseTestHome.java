package CommonPackages.WithBaseTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseTestHome {


    private WebDriver driver;

    public BaseTestHome(WebDriver driver){
        this.driver = driver;
    }

    private final By registerBtn = By.className("ico-register");


    public BaseTestHome clickOnRegisterBtn(){
       ActionsPage.click(driver, registerBtn);
       return this;
    }


}
