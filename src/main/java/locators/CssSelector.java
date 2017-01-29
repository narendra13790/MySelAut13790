package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	WebDriver driver;
	public void locators() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='#login'] ")).click();
		driver.findElement(By.cssSelector("form.ajaxlogin > fieldset:nth-child(5) > input[type='text']")).sendKeys("nare13790");
		driver.findElement(By.cssSelector("form.ajaxlogin > fieldset:nth-child(6) > input[type='password']")).sendKeys("password2123");
		driver.findElement(By.xpath("//*[@id='load_form' and @class='ajaxlogin']/div/div[2]/input")).click();// we can use click()
		
		// find element using css
		
	}

	public static void main(String[] args) {
		new CssSelector().locators();
	}
}
