package seleniumTestNG;


import org.testng.annotations.Test;

public class GroupTests {

	
	@Test(groups={"Sanity"})
	public void test()
	{
		System.out.println("Group Sanity testing");
	}
	@Test(groups={"Sanity, Smoke, HighPriority"})
	public void test2()
	{
		System.out.println("Group Sanity, Smoke, HighPriority ");
	}
	@Test(groups={"LowPriority"},dependsOnGroups={"grp1"})
	public void test3()
	{
		System.out.println("Group  LowPriority ");
	}
	
	@Test(groups={"grp1"})
	public void test4()
	{
		System.out.println(" test3 is depends on test4 ");
	}
	
	

}
