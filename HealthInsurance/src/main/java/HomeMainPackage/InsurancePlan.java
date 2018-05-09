package HomeMainPackage;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.lang.InterruptedException;

public class InsurancePlan extends CommonAPI {


@FindBy(id="PrimaryApplicant_BirthDate") WebElement ApplicantDOB;
@FindBy(css="#PrimaryApplicant_HasTobaccoUsage") WebElement PrimaryTobaccoUse;
@FindBy(css="#Spouse_BirthDate") WebElement SpouseDOB;
@FindBy(css="#Spouse_HasTobaccoUsage") WebElement SpouseTobacco;
@FindBy(css="#Children_93d4497a-1fec-47f0-aa5e-d97647695a17__Gender") WebElement ChildGender;
@FindBy(css="#Children_93d4497a-1fec-47f0-aa5e-d97647695a17__BirthDate") WebElement ChildDOB;
@FindBy(css="#Children_93d4497a-1fec-47f0-aa5e-d97647695a17__HasTobaccoUsage") WebElement childTobacco;
@FindBy(css="#hylViewPlans") WebElement ViewPlans;


    public void FindInsurancePlan() throws InterruptedException
    {
        driver.navigate().to("https://www.uhone.com/Quote/QuoteCensus/");

        Select Gender = new Select(driver.findElement(By.cssSelector("#PrimaryApplicant_Gender")));
        Select PrimaryTobaccoUse = new Select(driver.findElement(By.cssSelector("#PrimaryApplicant_HasTobaccoUsage")));
        WebElement zipCode= driver.findElement(By.cssSelector("#LocationViewModel_ZipCode"));
        Gender.selectByIndex(1);
        sleepFor(2);
        PrimaryTobaccoUse.selectByIndex(0);
        sleepFor(2);
        zipCode.sendKeys("11704");
        sleepFor(5);
        navigateBack();

    }

    public void HealthPlans()
    {
        driver.navigate().to("https://www.healthinsurance.com/demographics?product=stm");


    }
}
