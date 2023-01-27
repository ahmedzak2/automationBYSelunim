package base;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utills.CookieManger;
import utills.WindowManger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTEst {
    // to use add web-driver to start the browsers
    // to make it listing to event
    //private EventFiringWebDriver driver;// to start handle the project and make use of it
    // private WebDriver driver;
    protected HomePage homePage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        /*
         * we use this line to call web-driver i can change it to what i  need if fire fox or chorme or  any broswer
         */

        //System.setProperty("webdriver.chrome.driver", "/home/zik/pratice/projectAutomate1/.idea/resources/chromedriver");
// to initiate the browser if not chrome follow the same steps
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        /*
         after change the webdriver to eventFiringWebDriver
        you must create class to make the webdriver  lisiting by using register

        it takes a class  to make the funticon ork
         */

       // driver.register(new EventReporter());        // to lunch the browser
        // to make  it wait for 30 second to fail if not find the element  and throw not find element expection
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        gohome();
        //driver.manage().window().fullscreen();
        /*
         * to add instance of home page to use it to navigate for all pages
         */
        homePage = new HomePage(driver);

        System.out.println(driver.getTitle());
        /*
         * there 2 type of web element signle element or list as in 2 example  the list it use get more than one elements
         */
        WebElement inputlink = driver.findElement(By.linkText("Inputs"));
        List<WebElement> count = driver.findElements(By.tagName("a"));
        System.out.println(count.stream().count());

        System.out.println(count.size());
        //inputink.click();
//    WebElement test = driver.findElement(By.linkText("Example 1: Menu Element"));
// we need to use the assert equal to make sure
// TO MAKE SURE THE BROSWER IS CLOSE
        // driver.quit();
        /*
         * to control the size of window
         */

    }

    public WindowManger getWindowManger() {
        return new WindowManger(driver);
    }


    public void gohome() {
        driver.get("https://the-internet.herokuapp.com/");

    }


    // to take screenshot after every method
    /*
public void takeScreenShot(){
        var camera= (TakesScreenshot)driver;
        // to save screenshot as  file
    File screenshot = camera.getScreenshotAs(OutputType.FILE);
    try {
        Files.move(screenshot,new File("/home/zik/pratice/projectAutomate1/.idea/resources/screenshot/test.png"));

    }catch (IOException e){
        e.printStackTrace();
    };

     System.out.println("Screen shot taken :"+screenshot.getAbsolutePath());

    }*/
    // to make it show the result only and take screenhot of it


    //@AfterMethod

    public void recodrResult(ITestResult result) {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        // if you want to show the screenshot of fail  use it
        if (ITestResult.FAILURE == result.getStatus()) {
            // to save screenshot as  file

            try {
                Files.move(screenshot, new File("/home/zik/pratice/projectAutomate1/.idea/resources/screenshot/failure/" + result.getName() + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }

        if (ITestResult.SUCCESS == result.getStatus()) {
            try {
                Files.move(screenshot, new File("/home/zik/pratice/projectAutomate1/.idea/resources/screenshot/success/" + result.getName() + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            ;

        }
        // to save screenshot as  file

        System.out.println("Screen shot taken :" + screenshot.getAbsolutePath());


    }



    @AfterMethod
    public void clossSreen() {
         driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        /*
         * to run test without open the browser
         */
        //options.setHeadless(true);
        return options;
    }

    // to make the website store cookies
    public CookieManger getCookieManager(){
        return new CookieManger(driver);
    }
}
