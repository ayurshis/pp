package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZerodhaSignUp {
	
	    @FindBy(xpath="//a[text() =\"Don't have an account? Signup now!\"]") private WebElement Signup;
		@FindBy(xpath="//input[@type='text']") private WebElement MobNo;
		@FindBy(xpath="//button[@id =\"open_account_proceed_form\"]") private WebElement Continue;
		@FindBy(xpath="//a[@href ='/open-account/nri']") private WebElement NRI;
		
		
		public ZerodhaSignUp(WebDriver driver) {

			 PageFactory.initElements(driver, this);
			 
			}
		
		 public void clickInSignUP()  {
				Signup.click();
				}
		 
		 public void EnterMobNo(String mob)
		 {
		 	MobNo.sendKeys(mob);;
		 }
		 
		 public void clickOnContinue() {
			 Continue.click();
			 } 
		 
		 public void clickOnNRI() {
			 NRI.click();
			 } 
		
}
