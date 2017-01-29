package way2automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resizable {

	static WebDriver driver;
	Actions action;
	public Resizable()
	{
		initDriver();
	}
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/draggable.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[1]/input")).sendKeys("nare13790");
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[2]/input")).sendKeys("password2123");
		driver.findElement(By.xpath("//*[@id='load_form' and @class='ajaxlogin']/div/div[2]/input")).click();// we can use click()
		
		action= new Actions(driver);
		//driver.close();
		//driver.quit();
	}
	public void resize(String srcValue,int xOffSet) throws InterruptedException
	{
		Thread.sleep(10000);
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame' and @src='"+srcValue+"']")));
		//
		WebElement eleResiz2=driver.findElement(By.id("resizable"));
		
		// explicit wait 
		//1 init webdriver wait class
		WebDriverWait wait=new WebDriverWait(driver, 10);
		// 2 call until method of webdriver class with expected conditions
		WebElement ExplicitWayToFindElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='resizable' and @class='ui-widget-content ui-resizable']/div[@class='ui-resizable-handle ui-resizable-e']")));
		
		
		// 
		WebElement eleDivParent=driver.findElement(By.xpath("//div[@id='resizable']/h3[text()='Resizable']"));
		WebElement eleResiz=eleDivParent.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		
		action.clickAndHold(eleResiz)
		.moveByOffset(xOffSet, 0).build().perform();
		
		action.release().build().perform();
			Thread.sleep(10000);
		// switch to default content
		driver.switchTo().defaultContent();
	
	}
	
	public void selectMenu(String sMainMenu, String sSubMenu) throws InterruptedException
	{
	
		WebElement eleInteraction=driver.findElement(By.linkText(sMainMenu));
		action.clickAndHold(eleInteraction).build().perform();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'"+sSubMenu+"')]")).click();
		action.release().build().perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Resizable obj=new Resizable();
		
		
		obj.selectMenu("Interaction", "Resizable");
		
		obj.resize("resizable/default.html", 200);
		
		Thread.sleep(10000);
		driver.close();
		//Runtime.getRuntime().exec("\\task kill ");
		
	}
}
