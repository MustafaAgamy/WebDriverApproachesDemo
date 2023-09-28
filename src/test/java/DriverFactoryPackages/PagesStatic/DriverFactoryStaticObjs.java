package DriverFactoryPackages.PagesStatic;

import org.openqa.selenium.WebDriver;

public class DriverFactoryStaticObjs {

    private static WebDriver driver;

    public DriverFactoryStaticObjs(WebDriver driver){
        DriverFactoryStaticObjs.driver = driver;
    }

    public static DriverFactoryStaticHome goHome(){
        return new DriverFactoryStaticHome(driver);
    }
    public static DriverFactoryStaticLogin goLogin(){
        return new DriverFactoryStaticLogin(driver);
    }
}
