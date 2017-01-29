package testngFactory;

import org.testng.annotations.Test;

public class SimpleTest 
{
	int i=0;
	 SimpleTest(int ii)
	{
		i=ii;
	}
	 // in the absense of the default const. the following methos will not be run
	public SimpleTest() {
		// TODO Auto-generated constructor stub
	}
    @Test
    public void simpleTest() {
        System.out.println("Simple Test Method. i = "+i);
    }
}
 
