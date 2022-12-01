package spicejet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejet.Basepage.TestBase;

import java.util.List;

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

	@FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
	private WebElement byDepartCityAndGoingCity;

	@FindBy(xpath = "//a[@id='booking_engine_hotels']")
	private WebElement byHotels;

	@FindBy(xpath = "//input[@placeholder=\"Enter airport code/city\" and @class='css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g']")
	private WebElement byDepartCity;

	@FindBy(xpath = "//div[@id='divDirection']")
	private WebElement byFrame;


	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickDepartCity(){
		try {
			byClickDepart.click();
			byClickDepart.sendKeys("Pune");
			System.out.println("clicked on depart city");
		}
		catch (Exception e){
		}
	}

	public  void getValue(String name){
		driver.switchTo().frame(byFrame);
		List <WebElement> studentId= driver.findElements(By.xpath("//table[@class='di-tbl-data']//tr/td[1]"));
		List <WebElement> marks= driver.findElements(By.xpath("//table[@class='di-tbl-data']//tr/td[2]"));

		for(int i=0; i<studentId.size(); i++){

			if(studentId.get(i).getText().equalsIgnoreCase(name)){
				System.out.println(marks.get(i).getText());

				break;
			}

		}

	}

	public void clickGoingCity(){
		byClickGoing.click();
	}

	public void clickDepartCityAndGoingCity(){
		byDepartCityAndGoingCity.click();
		byDepartCityAndGoingCity.sendKeys("Pune");

	}

	public void clickByHotels(){
		try {
			byHotels.click();
			driver.getTitle();
			System.out.println("clicked on hotelss");
		}
		catch (Exception e){}
	}

	//initize page objects




	public boolean homepageLogo() {
		String logoText = byLogo.getText();
		System.out.println("text of logo is: " + logoText);
		return byLogo.isDisplayed();
	}

}
