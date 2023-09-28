package CommonPackages.NoBaseTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 1- This Class contains the Custom Methods that will be called in Page Objects since we're not inheriting it.
 * 2- The methods will be static and pass driver as a parameter for each method.
 * Pros : Less inheritance means easier code maintenance and better encapsulation since we will also be passing the
 * actual driver instance per page object.
 * Cons : can be a bit repeatable process.
 */
public class ActionsPage {

    protected static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    protected static void click(WebDriver driver, By locator){

        findElement(driver, locator).click();
    }
}
