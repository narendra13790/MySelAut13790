package seleniumTestNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * http://testng.org/doc/documentation-main.html#annotations
 * @author Swapna
 *
 */
public class DataProvider 
{

	@BeforeTest
	public void afterTest_CleanUp() {
		// driver close
		// db close
		//file close
		//initDriver()
		System.out.println("After Test....");
	}
	//	@Test(dataProvider = "data-provider-class", dataProviderClass = DataProviderClass.class)
	@Test(dataProvider="inputData",dataProviderClass = DPClass.class)
	public void testLogin(String usrName, String pwd)   {

		System.out.println("login test with user: "+usrName +" , and password :"+pwd);
	}
	
	@org.testng.annotations.DataProvider(name="input2")
	public Object[][] getInput2()
	{
		return new Object[][]{{"name1121","pwd12222222222222"},{"name2","pwd2"}};
	}
	
	@AfterTest
	public void afterTest() {
		// driver.close()
		System.out.println("@AfterTest......");
	}
	
}

