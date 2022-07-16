package Test;

import java.io.IOException;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser3;
import POM.ZerodhaLoginPage;

import Utility.Parameterization;
import Utility.Report;


public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser()
	{
		
		driver = Browser3.openBrowser();
	}
	
	@Test
	
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userName=Parameterization.getdata(0, 1);
		String password1=Parameterization.getdata(1, 1);
		
		zerodhaLoginPage.enterUserID(userName);
		zerodhaLoginPage.enterPassword(password1);
		zerodhaLoginPage.Clickonlogin();
		
	}
	
	@Test
public void forgotpasswordLinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ForgotuserID();
	}
	
	@Test
	public void signuplinktest() throws InterruptedException
{
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	zerodhaLoginPage.clickInSignUP();
	
	Set<String> set = driver.getWindowHandles();
	
	java.util.Iterator<String> window = set.iterator();
	 
	 while(window.hasNext()) {
		 String obj=window.next();
		 driver.switchTo().window(obj);
		 
		 if(driver.getCurrentUrl().equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account")) {
			
			 driver.findElement(By.xpath("//input[@type='text']"));
			 Thread.sleep(1000);	 
		 
	zerodhaLoginPage.EnterMobNo("9130585697");
	zerodhaLoginPage.clickOnContinue();
	zerodhaLoginPage.clickOnNRI();
	
	
}
	 }
}
	}


