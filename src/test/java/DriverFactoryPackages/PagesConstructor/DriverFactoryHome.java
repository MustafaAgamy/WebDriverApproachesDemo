package DriverFactoryPackages.PagesConstructor;

import CommonPackages.WithBaseTest.Pages.BaseTestSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DriverFactoryHome {


    private WebDriver driver;

    public DriverFactoryHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type='submit']");

    public DriverFactoryLogin clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return new DriverFactoryLogin(driver);
    }

    public BaseTestSearch sendInputAndClickSearch(String searchInput){
        ActionsPage.sendKeys(driver,searchField,searchInput);
        ActionsPage.click(driver,searchBtn);
        return new BaseTestSearch(driver);
    }
}
