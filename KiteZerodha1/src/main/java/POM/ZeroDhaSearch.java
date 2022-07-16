package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaSearch {
	@FindBy (xpath="//input[@type='text']")private WebElement search; 
	@FindBy (xpath="//li[@class='search-result-item selected isadded']")private WebElement list;
	@FindBy (xpath="(//button[@type='button']) [1] ")private WebElement buy; 
	@FindBy (xpath="//label[@class='su-radio-label']) [9]") private WebElement market; 
	@FindBy (xpath="(//label[@class='su-radio-label']) [10] ") private WebElement limit; 
	@FindBy (xpath=" (//label[@class='su-radio-label']) [11]") private WebElement slim; 
	@FindBy (xpath="(//label[@class='su-radio-label']) [12] ") private WebElement slmarket;

	public ZeroDhaSearch (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void Search (String Search) {
	search.sendKeys(Search);
	}
	public void EnterList() {
	list.click();
	}
	public void EnterBuy() {
	buy.click();
	}
	public void clickOnMarketRadio() {
	market.click();
	}
	public void clickonlimitRadio () {
	limit.click();
	}
	public void ClickOnSLRadio() {
	slim.click();
	}
	public void clickOnSLMRadio() {
	slmarket.click();
	}
}
