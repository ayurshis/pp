package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class TestListeners extends BaseClass implements ITestListener{
	WebDriver driver;
		
 public void onTestStart (ITestResult result) { 
	 System.out.println(result.getName()+" Test has started");
				 }
 
 public void onTestFailure (ITestResult result) { 		
	 try {
				
		 ScreenShot.takeScreenShot(driver, result.getName()); 
			} 
			catch (IOException e) { // TODO Auto-generated catch block 
				e.printStackTrace();
				 } 
				}
		public void onTestSuccess(ITestResult result) { 
			System.out.println(result.getName() + "Test success");
				
		  }
				
		public void onTestSkipped(ITestResult result) { 
			System.out.println(result.getName()+" Test Skipped");
			
				 }
				
				 
		}


