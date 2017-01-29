package saf.pagesteps.dataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class TestClass 
{
    @Test(dataProvider = "data-provider-class", dataProviderClass = DataProviderClass.class)
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
