package testng.GroupTest;

import org.testng.annotations.Test;

/**
 * Writing tests which belong to multiple groups
 * 
 * Earlier we learned about creating tests that belonged to a single group, but
 * TestNG allows test methods to belong to multiple groups also. This can be
 * done by providing the group names as an array in the groups attribute of the @Test
 * annotation. Let’s create a sample program with multiple groups to learn how
 * it is done.
 * 
 * @author NSG
 * 
 */
public class MultiGroupExample {
	@Test(groups = { "group-one","regression" })
	public void testMethodOne() {
		System.out.println("Test method one belonging to group.");
	}

	@Test(groups = { "group-one", "group-two","regression" })
	public void testMethodTwo() {
		System.out.println("Test method two belonging to both group.");
	}

	@Test(groups = { "group-two","HighPriority" })
	public void testMethodThree() {
		System.out.println("Test method three belonging to group.");
	}
}