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

	@FindBy(xpath = "//input[@id='BE_flight_origin_city']")
	private WebElement byClickDepart;

	@FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
	private WebElement byClickGoing;

	@FindBy(xpath = "//input[@placeholder=\"Enter airport code/city\" and @class='css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g']")
	private WebElement byDepartCityAndGoingCity;

	@FindBy(xpath = "//input[@placeholder=\"Enter airport code/city\" and @class='css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g']")
	private WebElement byDepartCity;

	public void clickDepartCity(){
		byClickDepart.click();
	}

	public void clickGoingCity(){
		byClickGoing.click();
	}

	public void clickDepartCityAndGoingCity(){
		byDepartCityAndGoingCity.click();
		byDepartCityAndGoingCity.sendKeys("Pune");

	}

	//initize page objects



	public boolean homepageLogo() {
		String logoText = byLogo.getText();
		System.out.println("text of logo is: " + logoText);
		return byLogo.isDisplayed();
	}

}
