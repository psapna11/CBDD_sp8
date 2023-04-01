package pageObject;

import base.Config;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class signup extends Config {
    public signup(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
        Faker faker = new Faker();
    //locator


    @FindBy(how=How.NAME, using = "firstName")
    public WebElement firstNameLocator;

    @FindBy(how=How.NAME, using = "lastName")
    public WebElement lastNameLocator;
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how = How.NAME, using = "confirmPassword")
    public  WebElement confirmPasswordLocator;
    @FindBy(how = How.NAME,using = "month")
    public WebElement monthLocator;
    @FindBy(how = How.NAME,using = "day")
    public WebElement dateLocator;
    @FindBy(how = How.NAME,using = "year")
    public WebElement yearLocator;
    @FindBy(how = How.ID,using = "female")
    public WebElement femaleLocator;
    @FindBy(how = How.ID, using = "male")
    public WebElement maleLocator;
    @FindBy(how = How.ID, using = "agree")
    public WebElement chekBoxtermLocator;
    @FindBy(how = How.XPATH, using = "//*[@id='signup-form']/button")
        public WebElement creatMyAccountBtnLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='success_message']/div")
    public WebElement successMsgLocator;


    //Function

//    public void clickOnButton(){newAccountButtonLocator.click();}
//    public void verifyIfUserOnSignupPage() {
//        String act = SignUpMsgLocator.getText();
//        String exp = "Sign Up";
//        Assert.assertEquals(act, exp);
//    }
    public void enterFirstName(){
        String fname = faker.name().firstName();
        firstNameLocator.sendKeys(fname);
    }
    public void enterFirstName(String fname){firstNameLocator.sendKeys(fname);}
    public void enterLastName(String lname){lastNameLocator.sendKeys(lname);}
    public void enterLastName(){lastNameLocator.sendKeys(faker.name().lastName());
    }
    public void enterEmailAddress(){
        //driver.findElement(By.name("email")).sendKeys(Email_Address); //hardcoded
        //emailLocator.sendKeys(faker.internet().emailAddress());
        String tt_domain = "@taltektc.com";
        String firstName = faker.name().firstName().toLowerCase();
        String lastName = faker.name().lastName().toLowerCase();
        String randomNum = faker.number().digits(4);
        String fullEmail = firstName+"."+lastName+randomNum+tt_domain;
        System.out.println(fullEmail);
        emailLocator.sendKeys(fullEmail);

    }
    public void enterPasswordAndConfirmPassword(){
        // driver.findElement(By.name("password")).sendKeys("abc123");
        String pass = faker.internet().password(5,12);
        passwordLocator.sendKeys(pass);
        confirmPasswordLocator.sendKeys(pass);
    }

    public void dropDownMonth(String month){
        Select mn = new Select(monthLocator);
                mn.selectByVisibleText(month);

    }

    public void dropDownDate(String day){
        Select da = new Select(dateLocator);
        da.selectByVisibleText(day);
    }
    public void dropDownYear(String year){
        Select ya = new Select(yearLocator);
        ya.selectByVisibleText(year);
    }
    public void chooseGender(String gender){
        if(gender.equalsIgnoreCase("female")){
            femaleLocator.click();
        }
        if(gender.equalsIgnoreCase("male")){
            maleLocator.click();
        }
    }
    public void chekboxAcceptTerm(boolean value) {
        if (value)chekBoxtermLocator.click();
    }
    public void ClickOnCreateMYAccount(){creatMyAccountBtnLocator.click();}
    public void verifyStudentID(){
        String SuccessMsg = successMsgLocator.getText();
        studentID = SuccessMsg.substring(38);
        System.out.println("Student ID: "+studentID);

    }



    }

