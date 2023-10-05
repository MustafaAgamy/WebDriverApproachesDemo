package CommonPackages.WithBaseTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseTestHome {


    private WebDriver driver;

    public BaseTestHome(WebDriver driver){
        this.driver = driver;
    }

    private final By registerBtn = By.className("ico-register");
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type='submit']");


    public BaseTestHome clickOnRegisterBtn(){
       ActionsPage.click(driver, registerBtn);
       return this;
    }

    public BaseTestSearch sendInputAndClickSearch(String searchInput){
        ActionsPage.sendKeys(driver,searchField,searchInput);
        ActionsPage.click(driver,searchBtn);
        return new BaseTestSearch(driver);
    }


}
