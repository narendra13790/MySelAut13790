package testng.Parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 2)Passing “Optional” Parameters Through testng.xml
 * 
 * @Parameters annotation. The preceding class file contains a single test
 *             method that takes one parameter as input. The said test method on
 *             execution prints the parameter value that is passed onto the
 *             console using the System.out.println method. The Parameter value
 *             is passed to the test method using the parameter named
 *             optional-value from the XML file. An optional value for the said
 *             parameter is defined using the @Optional annotation against the
 *             said parameter.
 * 
 * @author NSG
 * 
 */
public class ParameterTestOptional {
	/**
	 * In above test methods, the testng.xml file has two tests defined in it.
	 * No parameter is defined in the first test where as the second test
	 * declares a parameter named ‘optional-value‘ in it.
	 * 
	 * @param value
	 */
	@Parameters({ "optional-value" })
	@Test
	public void optionTest(@Optional("optional valueretretretre") String value) {
		System.out.println("This is: " + value);
	}
}