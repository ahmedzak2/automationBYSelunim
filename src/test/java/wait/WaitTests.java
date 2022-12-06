package wait;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTEst {
    @Test
    public void testWait(){
        var wait = homePage.cliconDynamic().clickOnEelementHidden();

        wait.CLickStart();
        assertTrue(wait.getLoadedtext().contains("Hello World!"),"there something went wrong");
    }
    @Test
    public void testrENDER(){
        var wait = homePage.cliconDynamic().clickOnExmaple2();
        wait.CLickStartRender();
        assertTrue(wait.getLoadedtext().contains("Hello World!"),"there something went wrong");
    }
}
