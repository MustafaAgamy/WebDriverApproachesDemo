package CommonPackages.WithBaseTestAndPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void test1(){
        baseTestAndPageHome.clickOnRegisterBtn();
    }

    @Test
    public void test2(){
        Assert.assertNotEquals(
                baseTestAndPageHome.
                        sendInputAndClickSearch("Laptop").
                        getSearchOutputs(),0,"No Search Results Match the Input");
    }
}
