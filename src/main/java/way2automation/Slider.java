package way2automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {

	static WebDriver driver;
	Actions action;
	public Slider()
	{
		initDriver();
	}
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/draggable.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[1]/input")).sendKeys("nare13790");
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[2]/input")).sendKeys("password2123");
		driver.findElement(By.xpath("//*[@id='load_form' and @class='ajaxlogin']/div/div[2]/input")).click();// we can use click()
		
		action= new Actions(driver);
		//driver.close();
		//driver.quit();
	}
	public void slider(String srcValue,int scaleValue) throws InterruptedException
	{
		Thread.sleep(10000);
		
		double scaleDefaultPercentage=11.1111;
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame' and @src='"+srcValue+"']")));
		//
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement eleSlider=driver.findElement(By.xpath("//*[@id='slider-range-max']/span"));
		
		WebElement eleSliderDiv=driver.findElement(By.xpath("//*[@id='slider-range-max']/div"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    String sliderStyle=eleSlider.getCssValue("style");
	    String sliderMovePercentage="left:"+scaleDefaultPercentage*scaleValue+"%";
	    
	    Thread.sleep(5000);
	    
	    js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2]);", eleSlider,"style",sliderMovePercentage);
	    
/*	    try {
			Runtime.getRuntime().exec("coomand to be run");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
	    
		 
		
	
		
		// switch to default content
		driver.switchTo().defaultContent();
	
	}
	
	public void selectMenu(String sMainMenu, String sSubMenu) throws InterruptedException
	{
	
		WebElement eleInteraction=driver.findElement(By.linkText(sMainMenu));
		Thread.sleep(2000);
		//action.clickAndHold(eleInteraction).build().perform();
		
		WebElement eleWidgetSubMenus=driver.findElement(By.xpath("//*[@id='toggleNav']/li[3]/ul"));
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    String sliderStyle="display: block;";
	    js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2]);", eleWidgetSubMenus,"style",sliderStyle);
	    
	    
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'"+sSubMenu+"')]")).click();
		//action.release().build().perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Slider obj=new Slider();
		
		
		obj.selectMenu("Widget", "Slider");
		
		obj.slider("slider/defult1.html", 4);
		
		Thread.sleep(10000);
		driver.close();
		//Runtime.getRuntime().exec("\\task kill ");
		
	}
}
