package CommonPackages.WithBaseTestAndPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTestAndPageSearch {

    private WebDriver driver;

    public BaseTestAndPageSearch(WebDriver driver){
        this.driver = driver;
    }

    private final By searchOutputs = By.xpath("//a[contains(normalize-space(), 'Laptop')]");

    public int getSearchOutputs(){
        return driver.findElements(searchOutputs).size();
    }
}
