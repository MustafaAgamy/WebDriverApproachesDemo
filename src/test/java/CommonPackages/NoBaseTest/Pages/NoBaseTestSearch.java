package CommonPackages.NoBaseTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoBaseTestSearch {

    private WebDriver driver;

    public NoBaseTestSearch(WebDriver driver){
        this.driver = driver;
    }

    private final By searchOutputs = By.xpath("//a[contains(normalize-space(), 'Laptop')]");

    public int getSearchOutputs(){
        return driver.findElements(searchOutputs).size();
    }
}
