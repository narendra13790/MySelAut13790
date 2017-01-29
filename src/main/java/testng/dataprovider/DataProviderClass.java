package testng.dataprovider;
import org.testng.annotations.DataProvider;
 
public class DataProviderClass 
{
    @DataProvider(name = "data-provider-class")
    public static Object[][] dataProviderMethod() 
    {
        return new Object[][] { { "data one" }, { "data two" } };
    }
}