package hover;

import base.BaseTEst;
import org.testng.annotations.Test;
import pages.Hovers;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HoverTests extends BaseTEst {
@Test
public void  testover(){
    Hovers hovers = homePage.clickHovers();
    Hovers.FigureCaption figureCaption =     hovers.hoverFristimage(1);
    assertTrue(figureCaption.isCaptionDisplayed(),"caption is not displayed");
    assertEquals(figureCaption.gettTitle(),"name: user1","caption is incorrect ");
   assertEquals(    figureCaption.getLinkText(),"View profile","caption is incorrect ");
   assertTrue(figureCaption.getLink().endsWith("/users/1"),"link is not cooret ");
figureCaption.getClass();
}
}
