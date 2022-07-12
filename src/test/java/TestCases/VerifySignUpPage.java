package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;

public class VerifySignUpPage extends BaseClass {
 
 
 @Test
  public void signUp() throws IOException, InterruptedException {
   
  
  driverInitialization();
  driver.get("https://login.salesforce.com/?locale=in");
  
  LoginPageObjects lp=new LoginPageObjects(driver);
  lp.tryForFree().click();
  
   SignUpPageObjects sp=new  SignUpPageObjects(driver);
   Thread.sleep(5000);
   
   //to enter first name method
   sp.enterFirstName().sendKeys("shweta");
   
   //to enter last name method
   sp.enterLastName().sendKeys("adhatrao");
   

   //to enter work email
   sp.enterWorkEmail().sendKeys("shweta3309@gmail.com");
   
   //to select job title - static drop down - use of select class
   Thread.sleep(3000);
   Select s=new Select(sp.selectJobTitle());
   s.selectByIndex(7);
   
  
   //to enter company name
   sp.enterCompanyName().sendKeys("Google pvt ltd");
   
   
 //to select employees - static drop down - use of select class
   Select s1=new Select(sp.selectEmployees());
   s1.selectByIndex(3);
 
   //to enter phone no
   sp.enterPhoneNo().sendKeys("8793863287");
   
   //to select country - static drop down - use of select class
   Select s2=new Select(sp.selectCountry());
   s2.selectByIndex(3);
 
     
   
  }
 
 
}
