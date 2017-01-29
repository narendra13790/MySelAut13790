package seleniumTestNG;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNgTest {

	@BeforeSuite
	public void beforeSuite_SetUp(ITestContext context) {
		// environment setup
		// config reading
		// opening base url and login
		context.setAttribute("name", "Naina");
		System.out.println("Before Suite....");
	}
	
	@BeforeSuite
	public void beforeSuite_SetUp22(ITestContext context) {
		// environment setup
		// config reading
		// opening base url and login
		context.setAttribute("name", "Naina");
		System.out.println("Before Suite2....");
	}

	@BeforeTest
	public void beforeTest_SetUp(ITestContext context) {
		// environment setup
		// config reading
		// opening base url and login
		context.setAttribute("name", "Naina");
		System.out.println("Before Test....");
	}
	
	@BeforeClass
	public void beforeClass(ITestContext context) {
		
		System.out.println("@BeforeClass....");
	}
	
	//
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod ....");
	}

	@Test
	public void test1() {
		System.out.println("Test1....");
	}

	@Test
	public void test2() {
		System.out.println("Test2....");
	}

	@AfterSuite
	public void afterSuite_CleanUp() {
		System.out.println("After Suite....");
	}
	// it will execute after each @Test Method
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod Suite....");
	}

	@AfterTest
	public void afterTest_CleanUp() {
		// driver close
		// db close
		//file close
		System.out.println("After Test....");
	}
	@AfterClass
	public void afterClass(ITestContext context) {
		
		System.out.println("@@AfterClass....");
	}

}
