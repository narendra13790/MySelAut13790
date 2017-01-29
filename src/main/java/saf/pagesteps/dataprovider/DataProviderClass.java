package saf.pagesteps.dataprovider;
import org.testng.annotations.DataProvider;
 
public class DataProviderClass 
{
    @DataProvider(name = "data-provider-class")
    public static Object[][] dataProviderMethod() 
    {
        return new Object[][] { { "data one","65415" }, { "data two","45415" } };
    }
}