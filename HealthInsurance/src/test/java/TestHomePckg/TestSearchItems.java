package TestHomePckg;

import HomeMainPackage.HealthHomePage;
import HomeMainPackage.SearchPlanUsingData;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.lang.String;

public class TestSearchItems extends SearchPlanUsingData
{
    SearchPlanUsingData inputsheet;
    HealthHomePage mainPage;
    String ItemName;

    @BeforeMethod
    public void initialization()
    {
        inputsheet = PageFactory.initElements(driver, SearchPlanUsingData.class);
        mainPage = PageFactory.initElements(driver, HealthHomePage.class);
    }

    //TC011: Read Data From Excel
    @Test(priority = 11)
    public void verifyDataReaderExcel() throws IOException, InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] actualItems = inputsheet.searchItemByName("zipcode.xls");
        String zipcode =  actualItems[0];

    }
}

















 /*typeByCssNEnter("#inputZIP", zipcode);
        sleepFor(2);
        HealthHomePage.ViewPlans.click();

            System.out.println("Data Reader search is Passed");
*/





