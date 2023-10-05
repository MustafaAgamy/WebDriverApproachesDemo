package PageConstructorsPackages.Pages;

import CommonPackages.WithBaseTest.Pages.BaseTestSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageConstructorsHome {


    private WebDriver driver;

    public PageConstructorsHome(WebDriver driver){
        this.driver = driver;
    }

    private final By loginBtn = By.className("ico-login");
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type='submit']");

    public PageConstructorsHome clickOnLoginBtn(){
       ActionsPage.click(driver, loginBtn);
       return this;
    }

    public BaseTestSearch sendInputAndClickSearch(String searchInput){
        ActionsPage.sendKeys(driver,searchField,searchInput);
        ActionsPage.click(driver,searchBtn);
        return new BaseTestSearch(driver);
    }
}
