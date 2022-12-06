package navigation;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTEst {
    @Test
    public void testNavigator(){
        homePage.cliconDynamic().clickOnEelementHidden();
        getWindowManger().goBack();
        getWindowManger().refreshPage();
        getWindowManger().goFroaward();
        getWindowManger().goTo("https://www.google.com/");

    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManger().switchToTab("New Window");
    }
@Test
    public void testExample2(){
        var buttonPage = homePage.cliconDynamic().havorright();
        getWindowManger().switchToNewTab();
    assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");

}
}
