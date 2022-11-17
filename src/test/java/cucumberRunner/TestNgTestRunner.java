package cucumberRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-parallel/output.json"},
        monochrome = true,
        //strict = true,
        features = "src/test/java/features/homepage.feature",
        glue = {"steps"}
        //tags = "@Homepage"
)

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        System.setProperty("browser.type","chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
        return super.scenarios();
    }
}

