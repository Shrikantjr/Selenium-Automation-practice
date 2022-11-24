package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        features = "",
        glue = {""}
        //tags = "@RegTest"
)

public class FailedTestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        //System.setProperty("browser.type","chrome");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
        return super.scenarios();
    }
}

