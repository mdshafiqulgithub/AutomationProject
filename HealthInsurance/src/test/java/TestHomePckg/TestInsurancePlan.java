package TestHomePckg;

import HomeMainPackage.InsurancePlan;
import base.CommonAPI;
import javafx.scene.layout.Priority;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestInsurancePlan extends InsurancePlan {

    //TC008: Find Insurance Plan
    @Test(priority= 8)
    public void TestAvailablePlan() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FindInsurancePlan();
    }

    //TC009: Find Insurance Plan
    @Test(priority= 9)
    public void TestHealthPlan() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthPlans();
    }
}
