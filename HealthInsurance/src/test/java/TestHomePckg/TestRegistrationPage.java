package TestHomePckg;

import HomeMainPackage.Registration;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestRegistrationPage extends Registration {

    //TC010: CheckRestration
   @Test(priority = 10)
    public void TestRegistration() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      HealthInsuranceRegistration();
      System.out.println("TC11 Registration page working");

    }
}
