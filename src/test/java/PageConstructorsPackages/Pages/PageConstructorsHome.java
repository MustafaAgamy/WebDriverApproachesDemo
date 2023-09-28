package PageConstructorsPackages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageConstructorsHome {


    private WebDriver driver;

    public PageConstructorsHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");


    public PageConstructorsHome clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return this;
    }


}
