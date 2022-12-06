package alert;

import base.BaseTEst;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileUploadTEst extends BaseTEst {
    @Test
    public void testFile(){
        var file = homePage.clickonFile();
        file.uploadFile("/home/zik/pratice/projectAutomate1/.idea/resources/chromedriver");
        assertTrue(file.findFile().contains("File Uploaded!"),"there wrong message");
        assertEquals(file.findUploadFile(),"chromedriver","there wrong message ");
    }
}
