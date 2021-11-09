package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	
 public static WebDriver driver;

@BeforeMethod
public void setup() {
	
	   System.setProperty("webdriver.chrome.driver","chromedriver");
	    driver = new ChromeDriver(); 
	   driver.get("https://www.simplilearn.com/");
	   driver.manage().window().maximize() ;
	   driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	    
}	

@AfterMethod
public void teardown()  {
	
	driver.quit();
}
}