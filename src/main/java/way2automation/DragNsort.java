package way2automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNsort {

	static WebDriver driver;
	Actions action;
	public DragNsort()
	{
		initDriver();
	}
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/draggable.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[1]/input")).sendKeys("nare13790");
		driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxlogin']/fieldset[2]/input")).sendKeys("password2123");
		driver.findElement(By.xpath("//*[@id='load_form' and @class='ajaxlogin']/div/div[2]/input")).click();// we can use click()
		
		action= new Actions(driver);
		//driver.close();
		//driver.quit();
	}
	public void drag1(int intValue,String hrefValue,String srcValue) throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//ul[1]/li["+intValue+"]/a[@href='"+hrefValue+"']")).click();
		
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame' and @src='"+srcValue+"']")));
		WebElement eleToBeDrag=driver.findElement(By.xpath(".//ul[2]/li[1]"));
		action.dragAndDropBy(eleToBeDrag, 0, 100).build().perform();
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
	
		DragNsort obj=new DragNsort();
		obj.selectMenu("Interaction", "Draggable");
		obj.drag1(5,"#example-1-tab-5","draggable/default5.html");
		
		System.out.println("Script successfully executed!");
		Thread.sleep(10000);
		driver.close();
		
	}
}
