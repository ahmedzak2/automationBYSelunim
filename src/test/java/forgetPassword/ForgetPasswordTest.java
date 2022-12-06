package forgetPassword;

import base.BaseTEst;
import org.testng.annotations.Test;
import pages.ForgotPassword;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTest extends BaseTEst {
@Test
    public  void retivePassowrd(){
    ForgotPassword forgotPassword = homePage.retiveEmail();
    forgotPassword.enterEmail("ahmedziko500@gmail2.com");
    assertEquals(forgotPassword.getEmail(),"E-mail","you choose the wron choise  ");

    forgotPassword.preesbutton();

}
}
