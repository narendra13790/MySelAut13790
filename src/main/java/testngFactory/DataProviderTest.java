package testngFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Using @DataProvider along with the @Factory annotation
 * 
 * The @DataProvider feature can also be used with the @Factory annotation for
 * creating tests at runtime. This can be done by declaring the @Factory
 * annotation on a constructor of a class or on a regular method.
 * 
 * @author NSG
 * 
 */
public class DataProviderTest {
	private int param;

	@Factory(dataProvider = "dataMethod")
	public DataProviderTest(int param) {
		this.param = param;
	}

	@DataProvider
	public static Object[][] dataMethod() {
		return new Object[][] { { 0 }, { 1 } };
	}

	@Test(dataProvider="dataMethod")
	public void testMethodOne(int b) {
		int opValue = b;
		System.out.println("----Test method one output: " + opValue);
	}

	@Test
	public void testMethodTwo() {
		int opValue = param + 2;
		System.out.println("Test method two output: " + opValue);
	}
}