package CommonPackages.WithBaseTestAndPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseTestAndPageHome extends BasePage {



    public BaseTestAndPageHome(WebDriver driver){
        super(driver);
    }

    private final By registerBtn = By.className("ico-register");


    public BaseTestAndPageHome clickOnRegisterBtn(){
        click(registerBtn);
        return this;
    }

}
