package spicejet.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import spicejet.Basepage.TestBase;



public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//div[contains(text(),'Login to your account')]")
	private WebElement byLoginText;
	
	@FindBy(xpath = "//input[@placeholder='your@email.com' and @id='username']")
	private WebElement byEmailAddress;

	@FindBy(id = "password")
	private WebElement byPassword;

	@FindBy(xpath = "//span[contains(text(),'Remember me')]//preceding-sibling::span")
	private WebElement byRememberMe;

	@FindBy(xpath = "//a[text()='Forgot your password?']//following::div//input[@name='login']")
	private WebElement byClickOnLoginButton;

	@FindBy(xpath = "//img[starts-with(@alt,'TestProject')]")
	private WebElement byLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean loginpageLogo() {
		String logoText = byLogo.getText();
		System.out.println("text of logo is: " + logoText);
		return byLogo.isDisplayed();
	}

	public HomePage loginToApplication(String email, String password) {
		
//		String s1 = "//div[contains(text(),'Login to your account')]";
		isElementPresent(7);
//		wait.until(ExpectedConditions.invisibilityOf(byEmailAddress));
		byEmailAddress.sendKeys(email);
		System.out.println("entered email");
		byPassword.sendKeys(password);
		System.out.println("entered pass");
		byRememberMe.click();
		System.out.println("clikced on rememberme");
		byClickOnLoginButton.click();
		System.out.println("successfully login to appln");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new HomePage();
	}

}
