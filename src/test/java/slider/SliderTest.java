package slider;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTEst {
    @Test
    public void  testNumber4(){
var slide = homePage.clickonHorizontalSlider();
slide.sendArrrow(4);
assertEquals(slide.returnResult(),"4","the range is wrong ");
    }
}
