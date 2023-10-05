package DriverFactoryPackages.Factory;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


/**
 * This class contains the whole logic of setting & customizing your driver setup.
 * Pros: flexible way of setting and customizing your driver, ensuring driver thread-safety
 * better encapsulation and having it in a different class will help with working on the logic in a better way
 * Cons: can be a bit harder to implement if not used to it.
 */

public class DriverFactory {

    @Setter
    @Getter
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static WebDriver setDriver(String driverName, MutableCapabilities options){
        if(options != null) {
            switch (driverName.toLowerCase()) {
                case "firefox" -> driver.set(new FirefoxDriver((FirefoxOptions) options));
                case "edge" -> driver.set(new EdgeDriver((EdgeOptions) options));
                default -> driver.set(new ChromeDriver((ChromeOptions) options));
            }
        }
        else {
            switch (driverName.toLowerCase()) {
                case "firefox" -> driver.set(new FirefoxDriver());
                case "edge" -> driver.set(new EdgeDriver());
                default -> driver.set(new ChromeDriver());
            }
        }
        return driver.get();
    }

    public static WebDriver getChromeDriver(ChromeOptions options) {
        return setDriver("chrome", options);
    }
    public static WebDriver getEdgeDriver(EdgeOptions options) {return setDriver("edge", options);}

    public static WebDriver getFirefoxDriver(FirefoxOptions options) {
        return setDriver("firefox", options);
    }
    public static WebDriver getChromeDriver() {
        return setDriver("chrome", null);
    }
    public static WebDriver getEdgeDriver() {
        return setDriver("edge", null);
    }
    public static WebDriver getFirefoxDriver() {
        return setDriver("firefox", null);
    }

}
