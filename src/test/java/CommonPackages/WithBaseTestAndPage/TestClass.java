package CommonPackages.WithBaseTestAndPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void testDemo(){
        baseTestAndPageHome.clickOnRegisterBtn();
    }

    @Test
    public void testSearch(){
        Assert.assertNotEquals(
                baseTestAndPageHome.
                        sendInputAndClickSearch("Laptop").
                        getSearchOutputs(),0,"No Search Results Match the Input");
    }
}
