package DriverFactoryPackages.PagesConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverFactorySearch {

    private WebDriver driver;

    public DriverFactorySearch(WebDriver driver){
        this.driver = driver;
    }

    private final By searchOutputs = By.xpath("//a[contains(normalize-space(), 'Laptop')]");

    public int getSearchOutputs(){
        return driver.findElements(searchOutputs).size();
    }
}
