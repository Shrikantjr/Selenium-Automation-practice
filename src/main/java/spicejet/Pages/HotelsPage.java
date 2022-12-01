package spicejet.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejet.Basepage.TestBase;

public class HotelsPage extends TestBase {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='BE_hotel_htsearch_btn']")
    private WebElement byHotelsSearchButton;

    public HotelsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHotelsSearchButton(){
        byHotelsSearchButton.click();
        System.out.println("Clicked on hotels search button");
    }
}
