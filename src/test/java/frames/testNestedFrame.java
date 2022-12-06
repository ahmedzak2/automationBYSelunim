package frames;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testNestedFrame extends BaseTEst {
    @Test
    public void testNested(){
        var nested = homePage.clickOnframe();
        var frames= nested.clickonNestedFrame();
        assertTrue(frames.switchToLeftFrame().contains("LEFT"),"there something went wrong ");
          assertTrue(frames.switchToBottom().contains("BOTTOM"),"there something went wrong ");

    }
}
