package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.login;

public class loginSteps extends Config {
    login lp = new login(driver);

    @Given("user should be on TalentTEK homepage")
    public void userShouldBeOnTalentTEKHomepage() {
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(act, exp);
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
       lp.enterEmailAddress(Email_Address);

    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword(Password);

    }

    @When("user clicks on log in button")
    public void userClicksOnLogInButton() {
        lp.clickOnLoginButton();
    }

    @Then("user should be able to successfully login")
    public void userShouldBeAbleToSuccessfullyLogin() {
        lp.verifyIfStudentLoggedInSuccessfully();
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() {
        lp.enterPassword("invalidPassword");
    }




    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() {
        lp.enterEmailAddress("invalidEmail");

    }


    @Then("user should be able see {string}")
    public void userShouldBeAbleSee(String errorMsg) {
        lp.verifyErrorMessageForInvalidEmailOrPassword(errorMsg);
    }
}
