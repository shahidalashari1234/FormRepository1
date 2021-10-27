import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Page.WebForm;
import Page.PageObject;
import Page.Utils;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    public static final WebDriver driver= new ChromeDriver();

    @BeforeSuite
    public void before_suite() {
        //chrome driver location setup in Utils class
        String Base_URL="https://formy-project.herokuapp.com/form";
        String CHROME_DRIVER_LOCATION ="chromedriver";
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
    }




    @Test(testName = "Submit_a_webform")
    public static void submit_form() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/form");
        WebForm webForm=new WebForm(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJobTitle();
        //For Radio
        webForm.selectRadio1Button();
        webForm.selectRadio2Button();
        webForm.selectRadio3Button();
        //For Gender
        webForm.check_box1();
        webForm.check_box2();
        webForm.check_box3();
        //for dropdown use "Select"
        Select selectYears= new Select(driver.findElement(By.xpath("//*[@id=\"select-menu\"]")));
        selectYears.selectByVisibleText("2-4");
        webForm.enter_Date();
        Thread.sleep(5000);
        webForm.pressSubmitButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
    }
    @AfterSuite
    public void cleanup()
    {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
