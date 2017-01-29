package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UIWebElement
{
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/index.html");
		//driver.navigate().to("");
		String str=driver.findElement(By.name("tblname")).getTagName();
		System.out.println(str);
		System.out.println(driver.findElement(By.tagName("td")).getText());
		
		String str2=driver.findElement(By.xpath(".//td[@name='tblname']")).getText();
		String str3=driver.findElement(By.xpath(".//td[@name]")).getText();
		
		System.out.println(str2 +" = "+str3);
		
		// get all table contents
		WebElement eleTable=driver.findElement(By.xpath(".//table[@id='t01']"));
		
		List<WebElement>lstTh=eleTable.findElements(By.tagName("th"));
		for (WebElement webElement : lstTh) {
			System.out.println(webElement.getText());
		}
		
	
		
		
		
		///html/body/div[5]
		///html/body/div[5]/div[1]
		//div
		//div[@class='col-md-12 col-sm-12 col-xs-12 pad0']/i[contains(@class,'shCalenderBox')]
		//div[contains(@class,'shCalenderBox')]/div[2]
		// document.getElementById('start-date').getPreviousSibling()
		
		
		
	}
}
