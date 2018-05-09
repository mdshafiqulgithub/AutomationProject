package reporting;


import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

public class ExtentManager
{
    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance()
    {
        if(extent == null)
        {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(),"html");

            //It will Create Extent Report folder and Extent report.html
            extent = new ExtentReports(System.getProperty("user.dir")+"/Extent-Report/ExtentReport.html", true);

            extent.addSystemInfo("Host Name", "Local").addSystemInfo("Environment","QA")
                    .addSystemInfo("User Name", "Web Automation Test Result ");
            extent.loadConfig(new File(System.getProperty("user.dir")+ "/report-config.xml"));
        }
        return extent;
    }

    public static void setOutputDirectory(ITestContext context)
    {
        ExtentManager.context = context;
    }
}
