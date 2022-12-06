package cookie;

import base.BaseTEst;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookieTest extends BaseTEst {
@Test
    public void testCookie(){
    var cookieManger = getCookieManager();
    Cookie cookie =cookieManger.setCookie("buildCookie","%7B%TD");
cookieManger.deleteCookie(cookie);
    assertFalse(cookieManger.isDisplayed(cookie), "Cookie was not deleted");

}
}
