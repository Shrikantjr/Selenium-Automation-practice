package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import spicejet.Basepage.TestBase;

import java.io.File;
import java.io.IOException;

public class Hooks extends TestBase {

    @Before
    public void beforeScenario(){
        TestBase tb = new TestBase();
        tb.setDriver();
    }

    @After
    public void afterScenario() throws IOException {
        //driver.quit();

    }




    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        /*
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);


         */
        if (scenario.isFailed()){
         File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent= FileUtils.readFileToByteArray(sourcePath);
         scenario.attach(fileContent, "image/png", "image");
        }

    }
}
