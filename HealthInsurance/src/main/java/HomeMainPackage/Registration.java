package HomeMainPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Registration extends CommonAPI
{

    public void HealthInsuranceRegistration() throws InterruptedException
    {
        driver.navigate().to("https://www.myuhone.com/v3app/publicservice/loginv1/login.aspx?bc=049aa7d4-b6bf-4d14-86be-bd9ac60e0b40&serviceid=9e095d9e-34db-4518-a6b4-390253061a7d");

       WebElement username =driver.findElement(By.xpath(".//*[@id='username']"));
       WebElement password=driver.findElement(By.xpath(".//*[@id='password']"));
       WebElement SignIn = driver.findElement(By.xpath(".//*[@id='loginButton']"));

        sleepFor(5);
        username.sendKeys("name");
        sleepFor(5);
        password.sendKeys("123");
        sleepFor(5);
        SignIn.click();
        sleepFor(5);

    }
}
