package javascript;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.util.List;


public class JavaScriptTest extends BaseTEst {
    @Test
    public void testJava(){
      homePage.clickonLargeDeepDom().scrollToTable();

}
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
    @Test
    public void testAddMultipleAttributeToDropdown() {

        var dropDownPage = homePage.clickonDropdown();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}

