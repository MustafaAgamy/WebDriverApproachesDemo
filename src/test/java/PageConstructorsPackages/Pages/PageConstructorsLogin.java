package PageConstructorsPackages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageConstructorsLogin {

    private WebDriver driver;
    public PageConstructorsLogin(WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.id("Email");
    private final By passwordField =By.id("Password");
    private final By confLoginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    public PageConstructorsLogin then(){
        return this;
    }

    public PageConstructorsLogin fillLoginData(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public PageConstructorsHome clickConfLoginBtn(){

        driver.findElement(confLoginBtn).click();
        return new PageConstructorsHome(driver);
    }
}
