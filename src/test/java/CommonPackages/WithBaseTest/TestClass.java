package CommonPackages.WithBaseTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{

    @Test
    public void test1(){
        baseTestHome.clickOnRegisterBtn();
    }

    @Test
    public void test2(){
        Assert.assertNotEquals(
        baseTestHome.
                sendInputAndClickSearch("Laptop").
                getSearchOutputs(),0,"No Search Results Match the Input");
    }
}
