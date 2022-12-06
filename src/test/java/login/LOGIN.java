package login;

import base.BaseTEst;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;
import static org.testng.Assert.*;

public class LOGIN extends BaseTEst {
    @Test
public void testSuccessfulLogi(){
LoginPage loginPage=  homePage.clickFormAuthenication();
loginPage.setUserName("tomsmith");
loginPage.serPassowrd("SuperSecretPassword!");
SecureArea secureArea= loginPage.clickLoginbutton();
// we use asserTrue to use part of error message to show if it has shown or not
    assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"),"alert text is incorrect");
}
}
