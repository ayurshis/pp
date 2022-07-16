package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableList {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
			int columnsize=column.size();
			System.out.println(columnsize);
			
			List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize = row.size();
		
		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		
		for(int i=0;i<currentprice.size();i++) {
			WebElement price = currentprice.get(i);
			String currentpriceValue=price.getText();
			System.out.println(currentpriceValue);
			
		}
			
}
}
