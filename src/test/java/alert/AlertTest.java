package alert;

import base.BaseTEst;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTEst {
    @Test
    public void testAcceptAlert(){
        var accptAlret = homePage.clickponAlert();
        accptAlret.trigeerAlret();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue( accptAlret.alretGetText().contains("I am a JS Alert"));
        accptAlret.acceptAlert();
        softAssert.assertEquals(accptAlret.findResult(),"You successfully clicked an alert","there wrong output") ;
       // to make sure it show all failed  assertation
        softAssert.assertAll();
    }
    @Test
    public void testGetTextFormat(){
        var alert = homePage.clickponAlert();
        alert.confirmAlret();
     String message = alert.alretGetText();
     alert.cancelAlert();
     assertEquals(message,"I am a JS Confirm","there wrong mesage ");
    }
    @Test
    public void testPrometALret(){
        var alert = homePage.clickponAlert();
        alert.prometAlret();
        //assertEquals(alert.alretGetText(),"I am a JS prompt","there wrong mesage ");
        String text = "ahmed";
        alert.alretSendMessage(text);
        alert.acceptAlert();
        assertEquals(alert.findResult(),"You entered: ahmed","there wrong mesage ");

    }


}
