package CommonPackages.NoBaseTest.Pages;

import CommonPackages.WithBaseTest.Pages.BaseTestSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NoBaseTestHome {


    private WebDriver driver;

    public NoBaseTestHome(WebDriver driver){
        this.driver = driver;
    }

    private final By registerBtn = By.className("ico-register");
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type='submit']");

    public NoBaseTestHome clickOnRegisterBtn(){
       ActionsPage.click(driver, registerBtn);
       return this;
    }

    public BaseTestSearch sendInputAndClickSearch(String searchInput){
        ActionsPage.sendKeys(driver, searchField,searchInput);
        ActionsPage.click(driver, searchBtn);
        return new BaseTestSearch(driver);
    }

}
