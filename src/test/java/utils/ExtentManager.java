package utils;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;

public class ExtentManager {
    private static ExtentReports extent;
    
    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
