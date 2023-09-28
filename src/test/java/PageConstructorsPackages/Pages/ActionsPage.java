package PageConstructorsPackages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsPage {

    protected static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    protected static void click(WebDriver driver, By locator){

        findElement(driver, locator).click();
    }
}
