package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
 
 //This driver dont have scope
 public WebDriver driver;
 
 //We have used encapsulation here
 private By username=By.xpath("//input[@id='username']");
 private By password=By.xpath("//input[@id='password']");
 private By logIn=By.xpath("//input[@id='Login']");
 
 By tryFree=By.xpath("//a[@id='signup_link']");
 
 
 public LoginPageObjects(WebDriver driver2) {
  this.driver=driver2;
 
 }

 public WebElement enterUsername() {
  return driver.findElement(username);
 }
 
 public WebElement enterPassword() {
  return driver.findElement(password); 
 }
 
 
 public WebElement clickOnLogin() {
  return driver.findElement(logIn); 
 }
 
 public WebElement  tryForFree() {
  return driver.findElement(tryFree); 
 }
 

 
}
