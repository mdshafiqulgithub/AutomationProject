package TestHomePckg;

import HomeMainPackage.HealthHomePage;
import HomeMainPackage.SearchPlanUsingData;
import base.CommonAPI;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import java.io.InterruptedIOException;
import java.io.IOException;
import java.lang.String;
import org.testng.Assert;
import org.testng.*;
import java.util.concurrent.TimeUnit;
import java.lang.String;


public class TestHomePage extends HealthHomePage
{
    HealthHomePage HealthMain;
    SearchPlanUsingData DataSearch;

    @BeforeMethod
    public void initialization()
    {
               HealthMain = PageFactory.initElements(driver, HealthHomePage.class);
    }
    //TC001: URL Verification
    @Test(priority = 1)
    public void TestURL() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualUrl = HealthMain.URLVerification();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String expectedUrl = "uhone.com";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        System.out.println("TC001:TestCase no.1 Passed");
    }

    //TC002: Title Verification
    @Test(priority = 2)
    public void TestTitleVerification() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualTitle = HealthMain.TitleVerification();
        String expectedTitle = "Health insurance made simple | UnitedHealthOne";
        System.out.println(actualTitle);

       Assert.assertTrue(actualTitle.contains(expectedTitle));
       System.out.println("TC002: TITLE Verification passed");
    }
    //TC003: Shop Insurance Clicked
    @Test(priority = 3)
    public void Testlink()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        boolean result;
        result = ShopInsuranceLink();
        Assert.assertEquals(result, true);
        System.out.println("TC003: " + "Shop Insurance link clicked");
    }

    //TC004: Search Test Plan
    @Test(priority = 4)
    public void TestSearchPlan() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthMain.Search();
        System.out.println("TC004: " + "Search Test Plan");

    }

    //TC005: Search By Code
    @Test(priority = 5)
    public void TestSearchByCode() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthMain.SearchByCode();
        System.out.println("TC005: " + "Search Test Plan");
    }
    //TC006: All Availble Plans
    @Test(priority = 6)
    public void TestAvailablePlans()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthMain.AllAvailablePlans();
    }

    //TC007: Health link Displayed
    @Test(priority = 7)
    public void TestHealthlink()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean result;
        result = isHealthLinkDisplayed();
        Assert.assertEquals(result, true);
        System.out.println("TC010: " + "Health link Displayed");
    }

    @Test(priority =8)
    public void TestPhoneNUMBER()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        boolean result;
        result = TelePhoneLink();
        Assert.assertEquals(result,true);
        System.out.println(" link is Enabled" +result);
    }

    @Test(priority =9)
    public void ShopForInsurance()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        boolean result;
        result = ShopInsuranceLink();
        Assert.assertEquals(result,true);

        System.out.println(" link is Enabled" +result);
    }
}

