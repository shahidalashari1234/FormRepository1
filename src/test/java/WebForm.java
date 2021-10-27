// Page URL: https://formy-project.herokuapp.com/form
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    public final String LAST_NAME = "Last Name";

   @FindBy(id = "first-name")
   private WebElement first_name;
 //WebElement first_name = driver.findElement(By.id("first-name"));
    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "/html/body/div/div")
    private WebElement alertsuccess;
    @FindBy(id="job-title")
    private WebElement job_title;
    @FindBy(id="radio-button-1")
    private WebElement radio1;
    @FindBy(id="radio-button-2")
    private WebElement radio2;
    @FindBy(id="radio-button-3")
    private WebElement radio3;
    //for checkbox
    @FindBy(id="checkbox-1")
    private WebElement check_box_1;
    @FindBy(id="checkbox-2")
    private WebElement check_box_2;
    @FindBy(id="checkbox-3")
    private WebElement check_box_3;
    @FindBy(id="datepicker")
    private     WebElement Date;

    public   WebForm(WebDriver driver) {
        super(driver);
    }
    public  void enterJobTitle(){
        this.job_title.sendKeys("SQA");
    }

    public void enterFirstName(){
        this.first_name.sendKeys("Shahida");
    }

    public void enterLastName(){
        this.last_name.sendKeys("Lashari");
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

   public void verifyAlertSuccess(){
        this.alertsuccess.isDisplayed();
   }
   public void selectRadio1Button()
   {
       this.radio1.click();
   }
    public void selectRadio2Button()
    {
        this.radio2.click();
    }
    public void selectRadio3Button()
    {
        this.radio3.click();
    }
    public void check_box1()
    {
           this.check_box_1.click ();
    }
    public void check_box2()
    {
        this.check_box_2.click ();
    }
    public void check_box3()
    {
        this.check_box_3.click ();
    }
    public  void enter_Date()
    {
        this.Date.sendKeys("10/11/2021");
    }

}*/