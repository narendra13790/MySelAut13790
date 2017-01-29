package testngFactory;

import org.testng.annotations.Test;

public class DependencyTest 
{
    private int param;
 
    public DependencyTest(int param) {
        this.param = param;
    }
 
    @Test(dependsOnMethods = { "testMethodTwo" },priority=0,invocationCount=5,invocationTimeOut=20000)
    public void testMethodOne() {
        System.out.println("Test method one with param values: " + this.param);
    }
 
    @Test
    public void testMethodTwo() {
        System.out.println("Test method two with param values: " + this.param);
    }
}
 
