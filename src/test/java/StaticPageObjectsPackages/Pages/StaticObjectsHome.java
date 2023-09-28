package StaticPageObjectsPackages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class StaticObjectsHome {


    private WebDriver driver;

    public StaticObjectsHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");


    public StaticObjectsHome clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return this;
    }


}
