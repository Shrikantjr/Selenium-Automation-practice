package spicejet.Basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import spicejet.util.TestUtil;

public class TestBase {

	public static RemoteWebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Shdevkam\\eclipse-workspace\\SpicejetTest\\src\\main\\java\\spicejet\\Config\\config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shdevkam\\Downloads\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	public static void isElementPresent(int t, String element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, t);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		}
		
		catch (Exception e) {
			Assert.fail("element is not displayed");
		}
	}
}
