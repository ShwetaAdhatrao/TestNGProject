package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
 
 public WebDriver driver;
 
 By FirstName=By.xpath("//input[@name='UserFirstName']");
 
 By LastName=By.xpath("//input[@name='UserLastName']");
 
 By WorkEmail=By.xpath("//input[@name='UserEmail']");
 
 By Company=By.xpath("//input[@name='CompanyName']");
 
 By JobTitle= By.xpath("//select[@name='UserTitle']");
 
 By Employees=By.xpath("//select[@name='CompanyEmployees']");
 
 By Phone=By.xpath("//input[@name='UserPhone']");
 
 By Country=By.xpath("//select[@name='CompanyCountry']");
 
 
 public SignUpPageObjects(WebDriver driver2) {
  this.driver=driver2;
 }


 public WebElement enterFirstName() {
  return driver.findElement(FirstName);
 }
 
 
public WebElement enterLastName(){
	return driver.findElement(LastName);
  }
 

 public WebElement enterWorkEmail() {
  return driver.findElement(WorkEmail);
 }
 
 
 public WebElement selectJobTitle() {
	  return driver.findElement(JobTitle);
	 }
 
 
 public WebElement enterCompanyName() {
	  return driver.findElement(Company);
	 }

 
 public WebElement selectEmployees() {
	  return driver.findElement(Employees);
	 } 

 public WebElement enterPhoneNo() {
	  return driver.findElement(Phone);
	 }
 
 public WebElement selectCountry() {
	  return driver.findElement(Country);
	 }  
}

