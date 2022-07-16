package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy(xpath="//input[@id='userid']") private WebElement UserID;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;	
	@FindBy(xpath="//a[text() =\"Forgot user ID or password?\"]") private WebElement ForgotuserID;
	@FindBy(xpath="//a[text() =\"Don't have an account? Signup now!\"]") private WebElement Signup;
	@FindBy(xpath="//input[@type='text']") private WebElement MobNo;
	@FindBy(xpath="//button[@id =\"open_account_proceed_form\"]") private WebElement Continue;
	@FindBy(xpath="//a[@href ='/open-account/nri']") private WebElement NRI;
	
    public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements (driver, this);
	}
	
	public void enterUserID(String emailaddress){
		UserID.sendKeys(emailaddress);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void Clickonlogin() {
		login.click();
	}
	
    public void ForgotuserID() {
	ForgotuserID.click();
	}
	
    public void clickInSignUP()  {
	Signup.click();
	}
	
	 public void EnterMobNo(String mob) {
	 	MobNo.sendKeys(mob);;
	 }
	 
	public void clickOnContinue() {
		 Continue.click();
		} 
	 
	 public void clickOnNRI() {
		 NRI.click();
		 }

	public String getErrorText() {
		// TODO Auto-generated method stub
		return toString();
	}

	
	

	
	}

	



