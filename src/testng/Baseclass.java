package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeTest       //before test will execute only once .....it has highest priority
	public void BeforeTestMethod() {
		System.out.println("Inside before test");
	}
	@BeforeMethod (alwaysRun =true)       // execute multiple times when method is called
	public void Setup()  {
		System.out.println("Inside before method");
	}
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("Inside before class");
	}
	@AfterMethod(alwaysRun=true)
	public void teardown()  {
		System.out.println("Inside after method");
}
	@AfterClass
	public void AfterClassTestMethod() {
		System.out.println("Inside after class");
	}
	@AfterTest
	public void AfterTestMethod() {
		
		System.out.println("Inside after test");
}
}