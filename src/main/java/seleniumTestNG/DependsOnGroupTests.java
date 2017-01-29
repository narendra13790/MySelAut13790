package seleniumTestNG;

import org.testng.annotations.Test;

public class DependsOnGroupTests {

	@Test(groups = { "LowPriority" }, dependsOnGroups = { "grp1"})
	public void test3() {
		System.out.println("Group  LowPriority ");
	}

	@Test(groups = { "grp1" })
	public void test4() {
		
		System.out.println(" test3 is depends on test4 ");
		int i=10/0;
	}

}
