package StaticPageObjectsPackages.Pages;

import org.openqa.selenium.WebDriver;

/**
 * 1- This is not a common approach it's just another way you can pass your driver to your PageObjects.
 * 2- This class will give access to your PageObjects which will make you able to continue with the flow of your testing.
 * 3- When calling the static methods the driver will be passed to each the returned PageObject automatically.
 * Pros: it can help a little bit with saving driver passing manually.
 * Cons: Can cause some readability issues if not used carefully.
 */
public class StaticObjects {

    private static WebDriver driver;

    public StaticObjects(WebDriver driver){
        StaticObjects.driver = driver;
    }

    public static StaticObjectsHome goHome(){
        return new StaticObjectsHome(driver);
    }
    public static StaticObjectsLogin goLogin(){
        return new StaticObjectsLogin(driver);
    }
}
