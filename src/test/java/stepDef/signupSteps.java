package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signupSteps extends Config {
    @Given("User in TalentTek Homepage")
    public void userInTalentTekHomepage() {
        String title= driver.getTitle();
        Assert.assertEquals(title,"Sign in");

    }

    @And("I click on the create new account")
    public void iClickOnTheCreateNewAccount() {
        driver.findElement(By.xpath("//*[@id='wrap']/div/div/div/a")).click();
    }

    @When("User enter first name")
    public void userEnterFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("Sana");
    }

    @And("User enter last name")
    public void userEnterLastName() {
        driver.findElement(By.name("lastName")).sendKeys("patel");
    }

    @And("User enter email address")
    public void userEnterEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("sap113@gmail.com");
    }

    @And("User enter Password")
    public void userEnterPassword() {
        driver.findElement(By.name("password")).sendKeys("abc123");
    }

    @And("User enter same Password in Confirm Password")
    public void userEnterSamePasswordInConfirmPassword() {
        driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
    }

    @And("User enter Birthdate By month,day,year")
    public void userEnterBirthdateByMonthDayYear() {
        WebElement month = driver.findElement(By.name("month"));
        Select sel = new Select(month);
        sel.selectByIndex(5);
        sel.selectByValue("06");
        //Thread.sleep(500);

        WebElement day = driver.findElement(By.name("day"));
        Select one= new Select (day);
        one.selectByValue("15");

        WebElement year =driver.findElement(By.name("year"));
        Select two =new Select(year);
        two.selectByValue("1939");
        two.selectByIndex(4);

    }

    @And("User select Gender")
    public void userSelectGender() {
        driver.findElement(By.id("female")).click();
    }

    @And("User select to agree {string}")
    public void userSelectToAgree(String arg0) {
        driver.findElement(By.id("defaultCheck1")).click();
    }

    @When("User Click on Create my account button")
    public void userClickOnCreateMyAccountButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("User should successfully signup brand new account")
    public void userShouldSuccessfullySignupBrandNewAccount() {
    }
}
