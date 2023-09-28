package CommonPackages.WithBaseTest;

import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void test1(){
        baseTestHome.clickOnRegisterBtn();
    }
}
