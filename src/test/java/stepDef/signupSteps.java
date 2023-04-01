package stepDef;

import base.Config;
import io.cucumber.java.en.And;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObject.signup;

public class signupSteps extends Config {
    signup sp = new signup(driver);



//    @And("I click on the {string} button")
//    public void userClickOnTheButton() {
//
//        driver.findElement(By.xpath("//*[@id='wrap']/div/div/div/a")).click();
//        sp.clickOnButton();
//    }
//    @And("User click on the {string} button")
//    public void userClickOnTheButton(String buttonText) {
//        //driver.findElement(By.xpath("//*[@id='wrap']/div/div/div/a")).click();
//        //a[contains(text(),'Create new account')]
//        driver.findElement(By.xpath("//a[contains(text(),'"+buttonText+"')]")).click();
//        //sp.clickOnButton(buttonText);
//    }
//    @And("user should be on TalentTek signup page")
//    public void userShouldBeOnTalentTekSignupPage(){
//        sp.verifyIfUserOnSignupPage();
//    }
    @And("User enter First and last name")
    public void userEnterFirstAndLastName() {
        sp.enterFirstName();
        sp.enterLastName();
    }




    @And("User enter email address")
    public void userEnterEmailAddress() {sp.enterEmailAddress();}
       // driver.findElement(By.name("email")).sendKeys("sap113@gmail.com"));

    @And("User enter Password and Confirm password")
    public void userEnterPasswordAndConfirmPassword() {sp.enterPasswordAndConfirmPassword();}


    @And("User enter month under Birthdate")
    public void userEnterMonthUnderBirthdate() {
        sp.dropDownMonth("Jun");
    }

    @And("User enter date under Birthdate")
    public void userEnterDateUnderBirthdate() {
        sp.dropDownDate("14");


    }

    @And("User enter year under Birthdate")
    public void userEnterYearUnderBirthdate() {
    sp.dropDownYear("1978");
    }


    @And("User select Gender as female")
    public void userSelectTheirGenderAs(String gender) {sp.chooseGender(gender);}
    @And("User select to agree term and condition checkbox")
    public void userSelectToAgreeTermAndConditionCheckbox(){
        sp.chekboxAcceptTerm(true);
    }




//
//    @And("User enter Birthdate By month,day,year")
//    public void userEnterBirthdateByMonthDayYear() {
//        WebElement month = driver.findElement(By.name("month"));
//        Select sel = new Select(month);
//        sel.selectByIndex(5);
//        sel.selectByValue("06");
//        //Thread.sleep(500);
//
//        WebElement day = driver.findElement(By.name("day"));
//        Select one= new Select (day);
//        one.selectByValue("15");
//
//        WebElement year =driver.findElement(By.name("year"));
//        Select two =new Select(year);
//        two.selectByValue("1939");
//        two.selectByIndex(4);
//
//    }
//
//    @And("User select Gender")

//    public void userSelectGender() {
//        driver.findElement(By.id("female")).click();
//    }
//
//    @And("User select to agree {string}")
//    public void userSelectToAgree(String arg0) {
//        driver.findElement(By.id("defaultCheck1")).click();
 //   }

    @When("User Click on Create my account button")
    public void userClickOnCreateMyAccountButton() {
       // driver.findElement(By.cssSelector("button[type='submit']")).click();
        sp.ClickOnCreateMYAccount();
    }

    @And("user enter {string} and {string} Name")
    public void userEnterAndName(String firstName, String lastName) {
        sp.enterFirstName(firstName);
        sp.enterLastName(lastName);
    }



    @And("User select Gender as {string}")
    public void userSelectGenderAs(String arg0) {
    }
    @Then("User should be able to get their studentID")
    public void userShouldBeAbleToGetTheirStudentID() {

    }






}



