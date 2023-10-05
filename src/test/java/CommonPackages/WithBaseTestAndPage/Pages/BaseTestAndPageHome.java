package CommonPackages.WithBaseTestAndPage.Pages;

import CommonPackages.WithBaseTest.Pages.BaseTestSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseTestAndPageHome extends BasePage {



    public BaseTestAndPageHome(WebDriver driver){
        super(driver);
    }

    private final By registerBtn = By.className("ico-register");
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type='submit']");

    public BaseTestAndPageHome clickOnRegisterBtn(){
        click(registerBtn);
        return this;
    }

    public BaseTestSearch sendInputAndClickSearch(String searchInput){
        sendKeys(searchField,searchInput);
        click(searchBtn);
        return new BaseTestSearch(driver);
    }

}
