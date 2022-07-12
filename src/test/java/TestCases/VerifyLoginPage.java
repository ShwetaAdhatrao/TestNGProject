package TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
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
	  
	 
	  
	 }
	 
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]=Constant.username1;
	  data[0][1]=Constant.password1;
	  data[1][0]=Constant.username2;
	  data[1][1]=Constant.password2;
	  return data;
	  
	 }
	 
	
	

}
