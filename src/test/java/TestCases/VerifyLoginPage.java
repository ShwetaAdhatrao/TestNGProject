package TestCases;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyLoginPage extends BaseClass {
	
	@Test(dataProvider="testData")
	 public void logInVerification(String username, String password) throws IOException {
	  //Browser launch
	  //url launch
	  //use of data provider concept
	  //enter username and password 6 entries
	  //click on log in button
	  
	  driverInitialization();
	  //This drive has scope
	  driver.get("https://login.salesforce.com/?locale=in");
	  
	  LoginPageObjects Lp=new LoginPageObjects(driver);
	  Lp.enterUsername().sendKeys(username);
	  Lp.enterPassword().sendKeys(password);
	  Lp.clickOnLogin().click();
	  
	  //to check case pass or fail 
	  //soft assert
	  //hard assert
	  
	  String actual=driver.findElement(By.xpath("//divide[@id='error']")).getText();
	  String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	  Assert.assertEquals("actual", "expected");
	 
	  
	 }
	 
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[3][2];
	  data[0][0]=Constant.username1;
	  data[0][1]=Constant.password1;
	  data[1][0]=Constant.username2;
	  data[1][1]=Constant.password2;
	  data[2][0]=Constant.username3;
      data[2][1]=Constant.password3;			  
	  return data;
	  
	 }
	 
	
	

}
