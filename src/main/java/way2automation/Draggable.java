package way2automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	WebDriver driver;
	Actions action;
	public Draggable()
	{
		initDriver();
	}
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[1]/input")).sendKeys("nare13790");
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[2]/input")).sendKeys("password2123");
		driver.findElement(By.xpath("//*[@id='load_form' and @class='ajaxlogin']/div/div[2]/input")).click();// we can use click()
		
		action= new Actions(driver);
		//driver.close();
		//driver.quit();
	}
	public void drag1()
	{
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame' and @src='draggable/default.html']")));
		WebElement eleToBeDrag=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(eleToBeDrag, 200, 50).build().perform();
		// again switch to main content
		driver.switchTo().defaultContent();
	}
	
	public void selectMenu(String sMainMenu, String sSubMenu) throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement eleInteraction=driver.findElement(By.linkText(sMainMenu));
		eleInteraction.click();
		action.moveToElement(eleInteraction).clickAndHold().build().perform();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'"+sSubMenu+"')]")).click();
		action.release().build().perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Draggable obj=new Draggable();
		obj.selectMenu("Interaction", "Draggable");
		obj.drag1();
		
		obj.selectMenu("", "");
		
	}
}
