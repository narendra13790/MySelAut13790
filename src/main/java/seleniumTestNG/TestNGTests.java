package seleniumTestNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * http://testng.org/doc/documentation-main.html#annotations
 * @author Swapna
 *
 */
public class TestNGTests 
{

	@BeforeTest
	public void afterTest_CleanUp() {
		// driver close
		// db close
		//file close
		//initDriver()
		System.out.println("After Test....");
	}
	@Test(enabled=true)
	public void test1() {
		System.out.println("Test1....");
	}

	@Test(enabled=false)
	public void test2() {
		System.out.println("Test2....");
	}
	
	@Test
	public void test10()
	{
		System.out.println("Test10....");
	}
	
	@Test(timeOut=5000)
	public void test3() throws InterruptedException {
		
		Thread.sleep(10000);
		System.out.println("Test3....");
	}
	
	@Test(invocationCount=5, timeOut=100)
	public void test4() throws InterruptedException  {
		
		Thread.sleep(3000);
		System.out.println("Test4....");
	}
	
	@Test(invocationCount=5, invocationTimeOut=1000)
	public void test5() throws InterruptedException  {
		
		Thread.sleep(3000);
		System.out.println("Test5....");
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void test6()   {

		System.out.println("Test6 will be failed if there is no nullpointer exception....");
		throw new NullPointerException();
	}
	
	@AfterTest
	public void afterTes() {
		// driver.close()
		System.out.println("@AfterTest......");
	}
	


	

}
