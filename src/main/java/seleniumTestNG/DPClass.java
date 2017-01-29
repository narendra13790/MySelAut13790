package seleniumTestNG;

import org.testng.annotations.DataProvider;

public class DPClass {

 @DataProvider(name="inputData")
	public static Object[][] getInputData()
	{
		return new Object[][]{{"name11111111111","pwd111111111111"},{"name222222222","pwd222222"}};
	}
}
