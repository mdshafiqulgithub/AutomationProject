package HomeMainPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.lang.InterruptedException;

public class HealthHomePage extends CommonAPI
{
    @FindBy(css = "#inputZIPbtn")
    public static WebElement ViewPlans;
    @FindBy(css="#inputZIP")
    public static WebElement zipCode;
    @FindBy(id = "link_1")
    public static WebElement ShopInsuranceLink;
    @FindBy(id = "#link_2")
    public static WebElement LearnAboutInsurance;
    @FindBy(id = "#link_3")
    public static WebElement FindDoctor;
    @FindBy(id = "#link_4")
    public static WebElement WhyUs;


    //@FindBy(css=".btn.lightblue")
   @FindBy(xpath = "//a[@class='btn btn-sm blue' and @title='Let Us Help You Find A Plan']")
    public static WebElement FindPlanLink;

    @FindBy(css= ".phonenumber")
    public static WebElement Telephone;
    @FindBy(xpath = "//a[@id='link_1'and @type='button']")
    public static WebElement ShopForInsurance;

    //URL Verification
    public String URLVerification() throws InterruptedException
    {
        String url = driver.getCurrentUrl();
        sleepFor(1);
        return url;
    }

    //Title Verification
    public String TitleVerification()
    {
        String Title = driver.getTitle();
        return Title;
    }

    //SHOP Insurance Link
    public boolean ShopInsuranceLink() {
        boolean result = ShopInsuranceLink.isEnabled();
        return result;
    }

    //LearnAboutInsurance
    public boolean LearnInsurance() {
        boolean result = LearnAboutInsurance.isEnabled();
        return result;
    }
    //FindDoctor Link
    public boolean FindDoctor() {
        boolean result = FindDoctor.isEnabled();
        return result;
    }
    //WhyUs Link
    public boolean WhyUS() {
        boolean result = WhyUs.isEnabled();
        return result;
    }

    //Button Display
    public boolean Search()
    {
        boolean ButtonDisplay = ViewPlans.isDisplayed();
        return ButtonDisplay;
    }

    public void SearchByCode() throws InterruptedException
    {
        zipCode.sendKeys("11704");
        Thread.sleep(5000);
        ViewPlans.click();
        Thread.sleep(1000);

        navigateBack();
        Thread.sleep(2000);
        zipCode.clear();
        zipCode.sendKeys("1304");
        Thread.sleep(5000);
        ViewPlans.click();
        goBackToHomeWindow();

    }

    public void AllAvailablePlans() throws InterruptedException
    {
        driver.navigate().to("https://www.uhone.com/insurance/short-term#");
        Thread.sleep(3000);
        navigateBack();
        driver.navigate().to("https://www.uhone.com/insurance/medicare");
        Thread.sleep(3000);
        navigateBack();
        driver.navigate().to("https://www.uhone.com/insurance/health");
        Thread.sleep(3000);
        navigateBack();

    }

   //FIND YOUR PLAN Link
    public boolean isHealthLinkDisplayed()
    {
       boolean FindPLink= FindPlanLink.isEnabled();
       return FindPLink;
    }


    public boolean TelePhoneLink()
    {
        boolean result = Telephone.isEnabled();
        return result;
    }

    public boolean ShopForInsuranceLink()
    {
        boolean result = ShopForInsurance.isEnabled();
        return result;
    }


}





