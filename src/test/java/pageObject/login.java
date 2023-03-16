package pageObject;

import base.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login extends Config
{
  public login(WebDriver driver){
    PageFactory.initElements(driver,this );
    Config.driver=driver;
  }
  //locators
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how = How.XPATH, using = "//*[@id='login_form']/input[3]")
    public WebElement loginButtonLocator;
    @FindBy(how = How.XPATH, using = "//*[@id='profile_form']/legend")
    public  WebElement welcomeMsgLocator;
    @FindBy(how = How.XPATH, using = "//*[@id='error_message']/div/h5")
    public WebElement invalidEmailOrPasswordErrorMsgLocator;


  //function
    public void enterEmailAddress(String email){
        //driver.findElement(By.name("email")).sendKeys(Email_Address); //hardcoded
        emailLocator.sendKeys(email);
  }
    public void enterPassword(String pass){

      passwordLocator.sendKeys(pass);
  }
    public void clickOnLoginButton(){
      loginButtonLocator.click();
  }
  public  void verifyIfStudentLoggedInSuccessfully(){
      String act = welcomeMsgLocator.getText();
      String exp = "Welcome to TalentTek";
    Assert.assertEquals(act, exp);

  }
  public void verifyErrorMessageForInvalidEmailOrPassword(String errorMsg){
      String fullText = invalidEmailOrPasswordErrorMsgLocator.getText();

      String act = fullText.substring(1, fullText.length()-1);
      Assert.assertEquals(act, errorMsg);


  }



}

