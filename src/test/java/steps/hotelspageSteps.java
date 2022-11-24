package steps;

import io.cucumber.java.en.When;
import spicejet.Basepage.TestBase;
import spicejet.Pages.HotelsPage;

public class hotelspageSteps extends TestBase {

    @When("i click on hotel search button")
    public void iClickHotelsSearchButton(){
        HotelsPage p2 = new HotelsPage();
        p2.clickHotelsSearchButton();
    }

}
