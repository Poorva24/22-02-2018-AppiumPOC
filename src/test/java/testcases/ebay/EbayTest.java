package testcases.ebay;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.ebay.StartEbay;


public class EbayTest extends TestBase {
	StartEbay Ebay;
	
	// Initializing driver
	@BeforeTest
	public void init(){
		Ebay = new StartEbay(driver);
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException{
	// Calling login function
		
	Ebay.login();
	
	Reporter.log("Login function executed");
	
	}
	
	@Test(priority=2)
	public void Shopping(){
	// Calling method to Add product
		
		Ebay.AddProduct();
		Reporter.log("Add Product function executed");
		
	}
		
	@Test(priority=3)
	public void SwipeScroll(){
	// Calling method for Swipe	
		
		Ebay.Swipe();
		Reporter.log("Scroll function executed");
		
	}
	
	
	
	
}
	

