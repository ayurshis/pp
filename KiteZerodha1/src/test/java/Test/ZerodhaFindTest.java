package Test;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser3;
import POM.ZeroDhaSearch;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parameterization;

public class ZerodhaFindTest {
WebDriver driver;
	
	@BeforeMethod
	public void Browser()
	{
		
		driver = Browser3.openBrowser();
	}
	
	@Test
	public void ValidCredential() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver); 
		String userName = Parameterization.getdata(0, 1);
		String password = Parameterization.getdata(1, 1); 
		zerodhaLoginPage.enterUserID(userName); 
		zerodhaLoginPage.enterPassword(password); 
		zerodhaLoginPage.Clickonlogin(); 
		Thread.sleep(5000); 
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver); 
		String pin = Parameterization.getdata(2, 1);
		//System.out.println(pin); 
		zerodhaPinPage.enterPin(pin);
		zerodhaPinPage.clickOnContinue();
		
	Set<String> set = driver.getWindowHandles();
	
	java.util.Iterator<String> window = set.iterator();
	 
	 while(window.hasNext()) {
		 String obj=window.next();
		 driver.switchTo().window(obj);
		 
		 if (driver.getTitle().equals("Dashboard/Kite")) {
			 driver.findElement(By.linkText("//button [@class = \"button-blue buy\"]"));
	}
		 ZeroDhaSearch Homepage =new ZeroDhaSearch(driver); 
		 Homepage.Search("TCS"); 
		 Homepage.EnterList();
		 Thread.sleep(1000);
		 Homepage.EnterBuy();
		 Thread.sleep(1000); 
		 Homepage.clickOnMarketRadio();
		 Thread.sleep(1000); 
		 Homepage.clickonlimitRadio();
		 Thread.sleep(1000); 
		 Homepage.ClickOnSLRadio();
		 Thread.sleep(1000); 
		 Homepage.clickOnSLMRadio();
	 }
	}
}
	


