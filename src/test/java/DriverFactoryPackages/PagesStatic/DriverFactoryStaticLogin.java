package DriverFactoryPackages.PagesStatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverFactoryStaticLogin {

    private WebDriver driver;
    public DriverFactoryStaticLogin(WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.id("Email");
    private final By passwordField =By.id("Password");
    private final By confLoginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    public DriverFactoryStaticLogin then(){
        return this;
    }

    public DriverFactoryStaticLogin fillLoginData(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public DriverFactoryStaticLogin clickConfLoginBtn(){
        driver.findElement(confLoginBtn).click();
        return this;
    }
}
