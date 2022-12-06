package frames;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WYSIWYGEditortest extends BaseTEst {
    @Test
    public void testEditor(){
        var editor = homePage.clickOnWysiwy();
        editor.clearBody();
    editor.enterText("hello");
        assertTrue(editor.getTextFromEditor().contains("hello"),"there wrong message ");

        editor.decreaseIndention();
    }
}
