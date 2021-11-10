package test; 
 
 @BeforeTest
 
 public void ReportSetup() throws IOException{
	 report = new ExtentReports("ExtentReport.html");
 }

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

@AfterTest
public void ReportTearDowm() throws IOException {
	wbook.close();
	report.flush();
	report.close();
	
	
}
}