package way2automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptAlert {

	static WebDriver driver;
	Actions action;
	public JavascriptAlert()
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
	public void alert(String srcValue) throws InterruptedException
	{
		Thread.sleep(10000);
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame' and @src='"+srcValue+"']")));
		
		//Simple Alert
		//driver.findElement(arg0)
		
		WebElement eleBtn=driver.findElement(By.xpath("//button[@onclick='myFunction()' and text()='Click the button to display an alert box:']"));
		eleBtn.click();
		
		// check for alert using explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		
		/*Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		
		
		// switch to default content
		driver.switchTo().defaultContent();
	
	}
	
	public void selectMenu(String sMainMenu, String sSubMenu) throws InterruptedException
	{
	
		/*WebElement eleRoot=driver.findElement(By.id(sMainMenu));
		
		System.out.println(eleRoot.getTagName());
		
		java.util.List<WebElement>lst=eleRoot.findElements(By.tagName("li"));
		for (WebElement webElement : lst) {
			
		System.out.println("---"+webElement.getText());
		}*/
		
		driver.findElement(By.xpath("//ul[@id='toggleNav']/li[7]/a")).click();
		
		
		
	}
	
	public void windowHandle(String sWindowName)
	{
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		JavascriptAlert obj=new JavascriptAlert();
		
		
		obj.selectMenu("toggleNav","Alert");
		
		obj.alert("alert/simple-alert.html");
		
		
		
		//
		
		/*String saveMainWindow=driver.getWindowHandle();// will return active window 
		
		Set<String> windows=driver.getWindowHandles();
		
		for (String strName : windows) {
			
			/*if(strName.equals(""))
			{
				driver.switchTo().window(strName);
				break;
			}
			driver.switchTo().window(strName);
			driver.close();
		}
		
		driver.switchTo().window(saveMainWindow);*/
		
		obj.windowHandle("");
		
		Thread.sleep(10000);
		driver.close();
		//Runtime.getRuntime().exec("\\task kill ");
		
		
	}
}
