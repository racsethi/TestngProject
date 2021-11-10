package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest extends Baseclass {
	
	XSSFWorkbook wbook;
    XSSFSheet sheet;
	 @Parameters({"UserName","Password"}) 
     @Test
     public void NegativeLogin(String UserNameVal,String PasswordVal) {
		 
		 LoginPage login = new LoginPage();
		login. Login(UserNameVal,PasswordVal);
		 login.ErrorCheck();
   
    }
	 
	 @Parameters({"UserName","CorrectPassword"}) 
     @Test(enabled = false)
     public void  PositiveLogin(String UserNameVal,String PasswordVal) {
		 
		 LoginPage login = new LoginPage();
		login. Login(UserNameVal,PasswordVal);	 
         report.endTest(test);
   
    }
	 
	 @Test
	 public void  ExcelTest() throws IOException{
		 FileInputStream fis = new  FileInputStream("exceldata.xlsx");
		 wbook = new XSSFWorkbook(fis);
		 sheet = wbok.getSheet("data");
	     String UserNameVal = sheet.getRow(0).getCell(0).getStringCellValue();
	     String PasswordVal = sheet.getRow(0).getCell(1).getStringCellValue();
	     test = report.startTest("Negative Login Test");
	     LoginPage login = new LoginPage();
			login. Login(UserNameVal,PasswordVal);	 
	   report.endTest(test);
	 }

	 
	 
	 
	
	 
	}
  