package StaticPageObjectsPackages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaticObjectsLogin {

    private WebDriver driver;
    public StaticObjectsLogin(WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.id("Email");
    private final By passwordField =By.id("Password");
    private final By confLoginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    public StaticObjectsLogin then(){
        return this;
    }

    public StaticObjectsLogin fillLoginData(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public StaticObjectsLogin clickConfLoginBtn(){

        driver.findElement(confLoginBtn).click();
        return this;
    }
}
