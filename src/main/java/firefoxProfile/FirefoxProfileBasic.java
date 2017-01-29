package firefoxProfile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxProfileBasic {
	
	public static void main(String[] args) throws IOException {
		
		ProfilesIni fi= new ProfilesIni();
		FirefoxProfile ff=fi.getProfile("MyProfile2");
		WebDriver driver= new FirefoxDriver(ff);
		driver.get("https://www.google.co.in/");
		
		
	}

}
