package testng.enableDiableTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.dataprovider.DataProviderClass;
 
public class TestClass 
{
    //@Test(dataProvider = "data-provider-test", dataProviderClass = DataProviderClass.class) -- class level
    @Test(dataProvider = "data-provider-test") // method level
    public void testMethod(String data) 
    {
        System.out.println("Data is: " + data);
    }
    @DataProvider(name="data-provider-test")
    public Object[][] dp() 
    {
    	return new Object[][]{{1},{2}};
    	//Object [][]arrObj=(Object[][]) new Object[2][2];
    	//arrObj[0][1]="2";
    }
}
