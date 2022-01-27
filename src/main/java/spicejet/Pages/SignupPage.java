package spicejet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.Basepage.TestBase;

public class SignupPage extends TestBase{
	
	@FindBy(id="first-name")
	WebElement byFirstName;
	
	@FindBy(id="last-name")
	WebElement byLastName;

	@FindBy(id="password")	
	WebElement byPassward;
	
	@FindBy(id="tp-sign-up")	
	WebElement bySignUp;
	
	@FindBy(xpath = "//span[@class='tp-checkbox-input-view']")
	WebElement byIAgreeCheckBox;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage SignUpDetails(String firstname, String lastname, String password) {
		byFirstName.sendKeys(firstname);
		System.out.println("entered firstname");
		byLastName.sendKeys(lastname);
		System.out.println("entered lastname");
		byPassward.sendKeys(password);
		System.out.println("entered password");
		byIAgreeCheckBox.click();
		bySignUp.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new HomePage();
		
		
		
	}
	
}
