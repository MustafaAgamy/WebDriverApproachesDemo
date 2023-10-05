package DriverFactoryPackages.PagesStatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverFactoryStaticSearch {

    private WebDriver driver;

    public DriverFactoryStaticSearch(WebDriver driver){
        this.driver = driver;
    }

    private final By searchOutputs = By.xpath("//a[contains(normalize-space(), 'Laptop')]");

    public int getSearchOutputs(){
        return driver.findElements(searchOutputs).size();
    }
}
