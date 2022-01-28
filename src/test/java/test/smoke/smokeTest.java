package test.smoke;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spicejet.Basepage.TestBase;
import spicejet.Pages.HomePage;
import spicejet.Pages.LoginPage;
import spicejet.Pages.PlatformPage;
import spicejet.Pages.SignupPage;
import test.Globals;




public class smokeTest extends TestBase{
	
	public smokeTest() {
		super();
	}
	
	public HomePage homepage;
	public SignupPage signuppage;
	public PlatformPage platformpage;
	public LoginPage loginpage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();	
	}
	
	
	@Test
	public void validateSuccessfullyCreatedUserAccount() {
		signuppage = homepage.createAccount(prop.getProperty("email"));
		homepage = signuppage.SignUpDetails(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("password"));
		
	}
	
	@Test
	public void validateUserSuccessfullyLogin() {
		String title = homepage.homepageTitle();
		Assert.assertEquals(title, "Free Test Automation For All | TestProject", "Title is not the same");
		System.out.println("title is matching");
		loginpage = homepage.clickOnLoginButton();
		homepage = loginpage.loginToApplication(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
