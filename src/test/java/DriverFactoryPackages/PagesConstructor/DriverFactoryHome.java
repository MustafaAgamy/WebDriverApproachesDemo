package DriverFactoryPackages.PagesConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DriverFactoryHome {


    private WebDriver driver;

    public DriverFactoryHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");


    public DriverFactoryLogin clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return new DriverFactoryLogin(driver);
    }


}
