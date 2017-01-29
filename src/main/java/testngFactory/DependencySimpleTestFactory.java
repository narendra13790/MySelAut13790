package testngFactory;

import org.testng.annotations.Factory;

/**
 * One of the main advantage of using the factory methods is that you can pass
 * parameters to test classes while initializing them. These parameters can then
 * be used across all the test methods present in the said classes
 * 
 * @author NSG
 * 
 */
public class DependencySimpleTestFactory {
	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new DependencyTest(1), new DependencyTest(2) };
	}
}