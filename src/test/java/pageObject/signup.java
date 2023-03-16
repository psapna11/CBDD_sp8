package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.PublicKey;

public class signup extends Config {
    public signup(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    //locator
    @FindBy(how = How.XPATH, using = "//*[@id='wrap']/div/div/div/a")
    public WebElement newAccountButtonLocator;
    @FindBy(how=How.XPATH, using = "//*[@id='signup-form']/legend")
    public WebElement SignUpMsgLocator;

    @FindBy(how=How.NAME, using = "firstName")
    public WebElement firstNameLocator;

    @FindBy(how=How.NAME, using = "lastName")
    public WebElement lastNameLocator;
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how = How.NAME, using = "password")
    public  WebElement confirmPasswordLocator;


    //Function

    public void clickCreateNewAccountButton(){newAccountButtonLocator.click();}
    public void verifyIfUserOnSignupPage() {
        String act = SignUpMsgLocator.getText();
        String exp = "Sign Up";
        Assert.assertEquals(act, exp);
    }
    public void enterFirstName(String name){
        firstNameLocator.sendKeys(name);
    }
    public void enterLastName(String lastname){
        lastNameLocator.sendKeys(lastname);
    }
    public void enterEmailAddress(String email){
        //driver.findElement(By.name("email")).sendKeys(Email_Address); //hardcoded
        emailLocator.sendKeys(email);
    }
    public void enterPassword(String pass){

        passwordLocator.sendKeys(pass);
    }
    public void userEnterConfirmPassword(String pass){

        confirmPasswordLocator.sendKeys(pass);
    }
}