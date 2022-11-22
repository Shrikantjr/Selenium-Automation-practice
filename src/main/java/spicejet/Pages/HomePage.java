package spicejet.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spicejet.Basepage.TestBase;

public class HomePage extends TestBase {
	
	WebDriver driver;
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



	public boolean homepageLogo() {
		String logoText = byLogo.getText();
		System.out.println("text of logo is: " + logoText);
		return byLogo.isDisplayed();
	}

}
