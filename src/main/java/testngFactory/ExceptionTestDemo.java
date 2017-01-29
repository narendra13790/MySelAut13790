package testngFactory;

import java.io.IOException;

import org.testng.annotations.Test;

/**
 * While writing unit tests there can be certain scenarios where we need to
 * verify that an exception is being thrown by the program during execution.
 * TestNG provides a feature to test such scenarios by allowing the user to
 * specify the type of exceptions that are expected to be thrown by a test
 * method during execution. It supports multiple values being provided for
 * verification. If the exception thrown by the test is not part of the user
 * entered list, the test method will be marked as failed. In below test, we
 * have two test methods i.e. exceptionTestOne() and exceptionTestTwo(). Here
 * exceptionTestOne() throws IOException where as exceptionTestTwo() throws
 * Exception. The expected exception to validate while running these tests is
 * mentioned using the expectedExceptions attribute value while using the Test
 * annotation.
 * 
 * @author NSG
 * 
 */
public class ExceptionTestDemo {
	@Test(expectedExceptions = { IOException.class })
	public void exceptionTestOne() throws Exception {
		throw new IOException();
	}

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}
}