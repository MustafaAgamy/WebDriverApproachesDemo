package CommonPackages.WithBaseTestAndPage;

import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void test1(){
        baseTestAndPageHome.clickOnRegisterBtn();
    }
}
