package testng;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass {
	

	@Test(groups = {"sanity"},dependsOnMethods= "CCTest")
	public void CreditCardTest() {
		
		System.out.println("Inside Credit Card");
}

	@Test(groups = {"sanity"})
	public void CCTest() {
		
		System.out.println("Inside CC Test");
	}
}