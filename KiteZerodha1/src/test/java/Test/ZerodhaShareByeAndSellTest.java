package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser3;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaShareByeAndSell;
import Utility.Parameterization;

public class ZerodhaShareByeAndSellTest {
	WebDriver driver;
	
	@BeforeMethod
	public void Browser() {
		
		driver = Browser3.openBrowser();
	}

	
@Test
public void LogIn() throws EncryptedDocumentException, IOException, InterruptedException {
ZerodhaLoginPage zerodhLoginPage = new ZerodhaLoginPage(driver);
String userName = Parameterization.getdata(0, 1);
String password1 = Parameterization.getdata(1, 1);

zerodhLoginPage.enterUserID(userName);
zerodhLoginPage.enterPassword(password1);
zerodhLoginPage.Clickonlogin();

Thread.sleep(3000);

ZerodhaPinPage zerodhPinPage = new ZerodhaPinPage(driver);
String Pin = Parameterization.getdata(2, 1);
zerodhPinPage.enterPin(Pin);
zerodhPinPage.clickOnContinue();

ZerodhaShareByeAndSell ZerodhaShareByeAndSell = new ZerodhaShareByeAndSell(driver);
String ShareName = Parameterization.getdata(3, 1);
System.out.println(ShareName);
Thread.sleep(3000);
ZerodhaShareByeAndSell.EnterShare(ShareName);
Thread.sleep(2000);
ZerodhaShareByeAndSell.ClickByeButtonShare(driver);
Thread.sleep(2000);
ZerodhaShareByeAndSell.RedioClick();
Thread.sleep(2000);
ZerodhaShareByeAndSell.RedioClickC();
Thread.sleep(2000);
ZerodhaShareByeAndSell.MarketValueClick();
Thread.sleep(2000);
ZerodhaShareByeAndSell.CheckBoxClick();
Thread.sleep(2000);
ZerodhaShareByeAndSell.ClickonBye();
Thread.sleep(2000);
ZerodhaShareByeAndSell.ClickOnSwitchT();
Thread.sleep(2000);
ZerodhaShareByeAndSell.ClickOnSeelSubmit();
Thread.sleep(2000);
}
}

