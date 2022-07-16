package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser3;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parameterization;

public class PinPageTest {

WebDriver driver;

@BeforeMethod 

public void launchBrowser() {
driver = Browser3.openBrowser();
}

@Test 
public void loginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver); 
String userName =Parameterization.getdata(0, 1);
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
}
}
