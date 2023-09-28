package DriverFactoryPackages.PagesStatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//No BaseTestAndPage.Pages.BasePage inheritance
public class DriverFactoryStaticHome {


    //Driver Object is initialized in BaseTestAndPage.HomePage
    private WebDriver driver;

    //The Passed driver from BaseTest which set the value to the initialized driver
    public DriverFactoryStaticHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");


    public DriverFactoryStaticHome clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return this;
    }


}
