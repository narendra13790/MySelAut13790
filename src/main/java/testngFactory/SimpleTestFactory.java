package testngFactory;

import org.testng.annotations.Factory;

/**
 * 
 Let’s learn about the @Factory annotation provided by TestNG. @Factory allows
 * tests to be created at runtime depending on certain data-sets or conditions.
 * 
 * Sometimes we may need to run a set of tests with different data values. To
 * achieve this we may define a separate set of tests inside a suite in the
 * testng XML and test the required scenario. The problem with this approach is
 * that, if you get an extra set of data, you will need to redefine the test.
 * TestNG solves this problem by providing the @Factory annotation feature.
 * Factory in TestNG defines and creates tests dynamically at runtime
 * 
 * @author NSG
 * 
 */
public class SimpleTestFactory {
	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new SimpleTest(5), new SimpleTest(10) };
	}
}