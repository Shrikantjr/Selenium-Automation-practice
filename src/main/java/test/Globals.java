package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import spicejet.Basepage.TestBase;

public class Globals extends TestBase {
	public static final int MAX_RETRY_COUNT = 2;
	static WebDriver driver;
	
	
	
//	public static void takeScreenshot(String fileName) throws IOException {
//		File ScrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		Files.copy(ScrShot, new File("C:\\Users\\Shdevkam\\eclipse-workspace\\"
//				+ "SpicejetTest\\Screenshot" + fileName + ".jpg"));
//		
//	}	
}

