package testng.GroupTest;

import org.testng.annotations.Test;

/**
 * TestNG also allows you to include and exclude certain groups from test
 * execution. This helps in executing only a particular set of tests and
 * excluding certain tests. A simple example can be when a feature is broken and
 * you need to exclude a fixed set of tests from execution since these test will
 * fail upon execution. Once the feature is fixed you can then verify the
 * feature by just executing the respective group of tests.
 * 
 * @author NSG
 * 
 */
public class ExcludeGroupTest {
	@Test(groups = { "include-group" })
	public void testMethodOne() {
		System.out.println("Test method one belonging to include group.");
	}

	@Test(groups = { "include-group" })
	public void testMethodTwo() {
		System.out.println("Test method two belonging to include group.");
	}

	@Test(groups = { "include-group", "exclude-group" })
	public void testMethodThree() {
		System.out
				.println("Test method three belonging to exclude/include groups.");
	}
}