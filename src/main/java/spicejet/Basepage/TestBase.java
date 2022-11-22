package spicejet.Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("hello there");
    }


}
