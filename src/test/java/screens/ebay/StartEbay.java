package screens.ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import listener.ExtentReporterNG;
import utility.ExcelReader;


@SuppressWarnings("unused")
public class StartEbay extends ScreenBase{
	
	ScreenBase s;
	
	// Getting data from Test data.xls
	String 	strUserName=excel.getCellData("Login", "UserName", 2);
	String 	strPassword=excel.getCellData("Login", "Password", 2);
	String 	strProduct=	excel.getCellData("Login", "Product", 2);
	
	
	// initializing driver locators 
	public StartEbay(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
		
		}
	
	
	// Getting path for excel
	public static ExcelReader excel = new ExcelReader(
	System.getProperty("user.dir") + "/src/test/resources/properties/testdata.xlsx");
		
	
	// Login function
	public void login(){
		
		System.out.print("In login function");
		Reporter.log("In login");
		
	// Login to eBay
	try {
		
		   waitMethod(1000);
		
			Click(Signin);
		
			waitMethod(6000);
		
			
			System.out.print(strUserName);
	
		    UserName.sendKeys(strUserName);
			waitMethod(3000);
			
			Password.click();
				
			Password.sendKeys(strPassword);
			
			waitMethod(3000);
			
			Click(Signin);
			
			waitMethod(3000);
				
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	// Function to add product in Ebay
	public void AddProduct(){
	
		try {	
			
	        SearchBoxIcon.click();
			waitMethod(1000);
			
			// Type product to search
			SearchTextbox.sendKeys(strProduct);
			waitMethod(4000);
			
			ProdSugg.click();
			waitMethod(4000);
			
			ProductDesc.click();
			
			waitMethod(4000);
			Product.click();
		
			waitMethod(2000);
			Buyitnow.click();
			
			waitMethod(4000);
			
					
			waitMethod(4000);
			
			MainMenu.click();
			waitMethod(4000);
			
			
			Home.click();
			waitMethod(4000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
		
		
// Function to perform swipe
	public void Swipe(){
		try{		
			
		Dimension size= driver.manage().window().getSize();
		  System.out.println(size);
		  
		//Find swipe x points from screen's with and height.
		  //Find x1 point which is at right side of screen.
		  int x1 = (int) (size.width * 0.20);
		  //Find x2 point which is at left side of screen.
		  int x2 = (int) (size.width * 0.80);
	
		  
		        Dimension dim = driver.manage().window().getSize();
				int height = dim.getHeight();
				int width = dim.getWidth();
				int y = (int)(height*0.20);
				int startx = (int)(width*0.75);
				int endx = (int)(width*0.35);
				driver.swipe(startx, y, endx, y, 500);
		
				Dimension dim1 = driver.manage().window().getSize();
				int height1 = dim1.getHeight();
				int width1 = dim1.getWidth();
				int x = width1/2;
				int starty = (int)(height1*0.80);
				int endy = (int)(height1*0.20);
				driver.swipe(x, starty, x, endy, 500);
				waitMethod(4000);
				
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}
	
}
	
		
		 
	
		
	
							
	


