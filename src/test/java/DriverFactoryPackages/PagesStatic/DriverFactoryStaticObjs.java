package DriverFactoryPackages.PagesStatic;

import org.openqa.selenium.WebDriver;

public class DriverFactoryStaticObjs {

    private WebDriver driver;

    public DriverFactoryStaticObjs(WebDriver driver){
        this.driver = driver;
    }

    public  DriverFactoryStaticHome goHome(){
        return new DriverFactoryStaticHome(driver);
    }
    public  DriverFactoryStaticLogin goLogin(){
        return new DriverFactoryStaticLogin(driver);
    }

    public  DriverFactoryStaticSearch goSearch(){
        return new DriverFactoryStaticSearch(driver);
    }
}
