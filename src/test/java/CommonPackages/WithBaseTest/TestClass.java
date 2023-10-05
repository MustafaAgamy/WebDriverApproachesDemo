package CommonPackages.WithBaseTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{

    @Test
    public void testDemo(){
        baseTestHome.clickOnRegisterBtn();
    }

    @Test
    public void testSearch(){
        Assert.assertNotEquals(
        baseTestHome.
                sendInputAndClickSearch("Laptop").
                getSearchOutputs(),0,"No Search Results Match the Input");
    }
}
