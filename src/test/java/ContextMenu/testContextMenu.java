package ContextMenu;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class testContextMenu extends BaseTEst {
@Test

    public void  testContext(){
    var context = homePage.clickonContext();
context.clickOnRightClick();
assertTrue( context.alert().contains("You selected a context menu"));

}

@Test
public void testRightClick(){

    var menuPage = homePage.clickonContext();
        menuPage.clickOnRightClick();
    String message = menuPage.alert();
        menuPage.acceptPopUp();
    assertEquals(message, "You selected a context menu", "Popup message incorrect");
}


}
