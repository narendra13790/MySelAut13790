package locators;

//autocomplete, javascript,maven


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScript {

	WebDriver driver;
	public void JS() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		// find element using js
		
		// step 1 :  convert driver into js executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		
		// for style 
		//js.executeScript("document.getElementById('lst-ib').style='font-size:20px;'");
		
		// get element by id using js
		/*Object obj=js.executeScript(" return document.getElementById('id').innerHTML;'");
		WebElement ele;
		if(obj instanceof WebElement)
		{
			ele=(WebElement)obj;
		}
		else if(obj instanceof String)
		{
			String  str=(String)obj;
		}*/
		
		
		Object obj=js.executeScript("return document.getElementById('lst-ib');");
		WebElement search = null;
		if(obj instanceof WebElement)
		{
			search=(WebElement)obj;
		}
		else if(obj instanceof String)
		{
			String  str=(String)obj;
		}
		search.sendKeys("Sel");
		
		js.executeScript("document.getElementById('lst-ib').value='Selenium';");
		
		WebElement ele=driver.findElement(By.id("gs_htif0"));
		
		String style="border: none; padding: 0px; margin: 0px; height: auto; width: 100%; position: absolute; z-index: 1; background-color: transparent; -webkit-text-fill-color: silver; color: silver; left: 0px; visibility: visible;";
		js.executeScript("arguments[0].setAttribute('style',arguments[1])",ele,style);
		js.executeScript("arguments[0].setAttribute('value',arguments[1])",ele,"narendra");
		
		System.out.println(ele.getAttribute("value"));
		
		
		
	}

	public static void main(String[] args) {
		new JavaScript().JS();
	}
}
