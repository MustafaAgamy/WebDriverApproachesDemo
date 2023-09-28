package DriverFactoryPackages.PagesConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverFactoryLogin {

    private WebDriver driver;
    public DriverFactoryLogin(WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.id("Email");
    private final By passwordField =By.id("Password");
    private final By confLoginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    public DriverFactoryLogin then(){
        return this;
    }

    public DriverFactoryLogin fillLoginData(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public DriverFactoryHome clickConfLoginBtn(){

        driver.findElement(confLoginBtn).click();
        return new DriverFactoryHome(driver);
    }
}
