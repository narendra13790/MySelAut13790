package testngFactory;

import java.io.IOException;

import org.testng.annotations.Test;

/**
 * Example of Expected Exception Test with Verifying Message
 * 
 * You can also verify a test based on the exception message that was thrown by
 * the test. Regular expression can also be used to verify the error message,
 * this can be done using .*. Depending upon the position of the regular
 * expression we can use it to do pattern matching such as starts-with,
 * contains, and ends-with while verifying the exception message
 * 
 * @author NSG
 * 
 */
public class ExceptionTestDemo2 {
	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
	public void exceptionTestOne() throws Exception {
		throw new IOException("Pass Message test");
	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*")
	public void exceptionTestTwo() throws Exception {
		throw new IOException("Pass Message test");
	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
	public void exceptionTestThree() throws Exception {
		throw new IOException("Fail Message test");
	}
}