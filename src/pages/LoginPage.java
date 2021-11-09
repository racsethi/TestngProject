package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import test.Baseclass;

public class LoginPage {
	
	WebDriver driver = Baseclass.driver;
	
	public void Login(String UName, String Pwd) {

	  WebElement LoginLink = driver.findElement(By.linkText("Log in"));
	    LoginLink.click();
	    
	    WebElement UserName = driver.findElement(By.name("user_login"));
	    UserName.sendKeys("UserNameVal");
	    
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.sendKeys("PasswordVal");
	    
	    WebElement LoginButton = driver.findElement(By.name("btn_login"));
	    LoginButton.click();
	    
	}	
	
	public void ErrorCheck() {
		
	
	 WebElement Error = driver.findElement(By.id("msg_box"));
	    
	    String ActualMsg = Error.getText();
	    String ExpMsg = "The email or password you have entered is invalid.";
	     
	  //  Assert.assertEquals(ActualMsg,ExpMsg);
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(ActualMsg , ExpMsg);
	    System.out.println("After assertion");
	    System.out.println("After assertion");
	    soft.assertAll();
}
	
}
