package spicejet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import spicejet.Basepage.TestBase;

public class HomePage extends TestBase {
	
	
	//Page Factory - OR;
	

	@FindBy(id ="cc-button")
	private WebElement byAcceptCookie;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement byLogin;

	
	@FindBy(name ="your-email")
	private WebElement byYourEmail;

	@FindBy(xpath ="//input[@class=\"wpcf7-form-control wpcf7-submit\"]")
	private WebElement byCreateAnAccount;
	
	@FindBy(xpath ="//img[@class='top-bar__logo-img custom-logo-link-2']")
	private WebElement byLogo;
	
	@FindBy(xpath = "(//a[contains(text(),'Platform')])[position()=1]")
	private WebElement byClickPlatform;
	
	//initize page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String homepageTitle() {
	return driver.getTitle();
		
	}
	
	public boolean homepageLogo() {
		String logoText = byLogo.getText();
		System.out.println("text of logo is: " + logoText);
		return byLogo.isDisplayed();
	}
	
	public SignupPage createAccount(String email) {
		byYourEmail.sendKeys(email);
		System.out.println("enter email");
		byCreateAnAccount.click();
		return new SignupPage();
		
	}
	
	public PlatformPage clickPlatform() {
		
		byClickPlatform.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new PlatformPage();
		
	}
	
	public LoginPage clickOnLoginButton() {
		byAcceptCookie.click();
		System.out.println("accepted cookie");
		byLogin.click();
		System.out.println("clicked on login button");
		return new LoginPage();
	}
}
