package spicejet.Basepage;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import spicejet.util.TestUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

	public static RemoteWebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	
	public TestBase(){
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\HD273UW\\project\\Selenium-Automation-practice_testproject_site\\src\\main\\java\\spicejet\\Config\\config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(String url) {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	public static void isElementPresent(int t) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, t);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='your@email.com' and @id='username']")));
		}
		
		catch (Exception e) {
			Assert.fail("element is not displayed");
		}
	}
	
	public void failed(String testMethodName){
		File ScrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(ScrShot, new File("C:\\Users\\Shdevkam\\eclipse-workspace\\"
					+ "SpicejetTest\\Screenshots\\" +testMethodName+ "_"+ ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
