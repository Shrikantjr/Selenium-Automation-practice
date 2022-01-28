import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.Basepage.TestBase;

@Listeners(CustomListener.class)
public class ScreenshotTest extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@Test
	public void loginToApplication() {
		Assert.assertEquals(false, true);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

