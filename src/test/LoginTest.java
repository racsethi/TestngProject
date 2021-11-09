package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest extends Baseclass {
	 @Parameters({"UserName","Password"}) 
     @Test
     public void NegativeLogin(String UserNameVal,String PasswordVal) {
		 
		 LoginPage login = new LoginPage();
		login. Login(UserNameVal,PasswordVal);
		 login.ErrorCheck();
   
    }
	 
	 @Parameters({"UserName","CorrectPassword"}) 
     @Test
     public void  PositiveLogin(String UserNameVal,String PasswordVal) {
		 
		 LoginPage login = new LoginPage();
		login. Login(UserNameVal,PasswordVal);	 
  
   
    }
	 
	 
	 
	}
  