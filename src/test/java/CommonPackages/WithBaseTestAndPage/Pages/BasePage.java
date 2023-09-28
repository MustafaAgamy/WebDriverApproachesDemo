package CommonPackages.WithBaseTestAndPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 1- You will pass the driver from BaseTest to your PageObject which are inheriting this BasePage.
 * 2- You will then call super Constructor which is the constructor of this page and pass the driver from PageObjects.
 * 3- The driver initialized here and used in the method will be assigned with a value from the passed driver.
 * 4- The methods can be used by calling them directly in the PageObjects.
 * Pros: Less repeatable code.
 * Cons: Issue with driver encapsulation, harder to maintain and keep your driver objects safe, especially in a
 * multi-threading environment.
 */
public class BasePage {


    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    protected void click(By locator){

        findElement(locator).click();
    }

}
