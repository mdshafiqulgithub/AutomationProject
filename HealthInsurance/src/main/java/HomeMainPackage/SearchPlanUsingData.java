package HomeMainPackage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import sun.applet.Main;
import utility.DataReader;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver.Navigation.*;


public class SearchPlanUsingData extends CommonAPI
{
    HealthHomePage MainPage;

    @BeforeMethod
    public void initialization()
    {
        MainPage = PageFactory.initElements(driver, HealthHomePage.class);

    }

    DataReader dtr = new DataReader();

    public String[] getExcelData(String fileName) throws IOException
    {
       // String path = "../HealthInsurance/data/" + fileName;
       String path = "../HealthInsurance/data/"+fileName;
        String[] output = dtr.colReader(path, 1);
        //System.out.println(output.length);
        return output;
    }

    public String[] searchItemByName(String fileName) throws IOException, InterruptedException
    {
        String[] items = getExcelData(fileName);
        String[] actual = new String[items.length];

        for (int i = 0; i < items.length; i++)
        {
            System.out.println("ZipCode: "+ items[i]);
        }
        return items;
    }

}
