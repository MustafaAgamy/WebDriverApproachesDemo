package CommonPackages.NoBaseTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NoBaseTestHome {


    private WebDriver driver;

    public NoBaseTestHome(WebDriver driver){
        this.driver = driver;
    }

    private final By registerBtn = By.className("ico-register");


    public NoBaseTestHome clickOnRegisterBtn(){
       ActionsPage.click(driver, registerBtn);
       return this;
    }


}
