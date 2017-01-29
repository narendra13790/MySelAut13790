package seleniumbasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
		// get all hyper links from specified webpage
		List<WebElement> lstElement =driver.findElements(By.tagName("a"));
	
		// iterating list of elements
		for(int i=0; i<lstElement.size();i++)
		{
			WebElement ele=lstElement.get(i);
			System.out.println(ele.getText()+" , "+ele.getAttribute("href"));
		}
		for(WebElement webElement : lstElement) {
			System.out.println(webElement.getText()+" , "+webElement.getAttribute("href"));
			
			String str=webElement.getText();
			if(str.equalsIgnoreCase("Travel Guide"))
			{
				webElement.click();
				//wait
				Thread.sleep(10000);
				break;
			}
			
		}
		driver.navigate().back();
		Thread.sleep(5000);
		//linktext- it will find element by linktext <a href="www.com">linktext</a>
		driver.findElement(By.linkText("Travel Guide")).click();
		
		
		
		
	}
}
