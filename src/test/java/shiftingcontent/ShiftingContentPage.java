package shiftingcontent;

import base.BaseTEst;
import pages.MenuElement;
import pages.ShiftingContent;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;


public class ShiftingContentPage extends BaseTEst {
    @Test
    public void testMenu() {

        ShiftingContent shiftingContent = homePage.clickshiftingContent();
    MenuElement menuElement = shiftingContent.clickMenu();

        assertEquals(menuElement.countLinks(),10);
    }
}
