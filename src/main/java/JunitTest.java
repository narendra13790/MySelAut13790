



public class JunitTest {
	
	
 // it will run once but before all test method
	//@BeforeClass
	public static void setUp2()
	{
		// browser/driver init
		// base url open
		// login 
		System.out.println("@@BeforeClass");
	}
	// Before will run before each test case (@Test)
	//@Before
	public  void setUp()
	{
		System.out.println("@Before");
	}
	//@Test
	public void test1()
	{
		System.out.println("@test1");
		//Assert
		//Assert.assertEquals(" give msg if expected  not matched with actual", "hello", "Hello");
		//Assert.assertEquals("expected was hello but found Hello", "hello", "Hello");
		
		String sExpected="Hello";
		String sActual="helloo";
		//verify
		if(sExpected.equals(sActual))
		{
			System.out.println(" pass");
		}
		{
			System.out.println("failed");
		}
	}
	
	//@Test
	public void test2()
	{
		System.out.println("@test2");
	}
	// after will run after each test case (@Test)
	//@After
	public  void afterClass()
	{
		System.out.println("@After");
	}
	
	 // it will run once but after all test method have been executed
	//@AfterClass
	public static void cleanUp()
	{
		//  driver close
		//  db close
		//  file close 
		//  logout
		System.out.println("@Afterclass");
	}
	
	
		

}
