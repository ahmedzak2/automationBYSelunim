package dropDown;

import base.BaseTEst;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;
import pages.DropDown;
import pages.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest  extends BaseTEst {
    @Test
    public void testSelectOption(){
        DropDown dropDown = homePage.clickDropdown();
        String option="Option 1";
        dropDown.selectFormDropdown(option);
        var selectedoption = dropDown.getSelectoption();
        System.out.println(dropDown.getSelectoption());
        assertEquals(selectedoption.size(),1,"you choose the wron choise  ");
        assertTrue(selectedoption.contains(option), "Option not selected");
        }

}
