package Keys;

import base.BaseTEst;
// to use all keys in keyboard
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTEst {
@Test
    public void  testkeys(){
    var keys = homePage.clickOnKeyPress();
    keys.sendCharacter("a"+ Keys.BACK_SPACE);
    assertEquals(keys.getResult(),"You entered: BACK_SPACE");

}
@Test
    public void testPi(){
    var keys = homePage.clickOnKeyPress();
keys.enterPI();
    assertEquals(keys.getResult(),"You entered: BACK_SPACE");

}
}
