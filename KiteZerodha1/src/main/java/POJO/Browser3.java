package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser3 {

public static WebDriver openBrowser() {
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);//upcasting Chrome driver class to WebDriver
	driver.get("https://kite.zerodha.com/");//method of WebDriver interface
	 driver.manage().window().maximize(); 
	 return driver;
}

}
	
	

	