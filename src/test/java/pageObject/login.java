package pageObject;

import base.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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




  //function
    public void enterEmailAddress(String email){
        //driver.findElement(By.name("email")).sendKeys(Email_Address);
        emailLocator.sendKeys(email);
  }
    public void enterPassword(String pass){

      passwordLocator.sendKeys(pass);
  }
    public void clickOnLoginButton(){
      loginButtonLocator.click();
  }



}

