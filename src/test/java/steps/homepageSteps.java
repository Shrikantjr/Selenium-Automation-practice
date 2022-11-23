package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import spicejet.Basepage.TestBase;
import spicejet.Pages.HomePage;

import java.util.Collections;
import java.util.List;

public class homepageSteps extends TestBase {

    @And("I select the Departure date")
    public void iSelectTheDepartureDate(DataTable data) {
        List<List<String>> obj = Collections.singletonList(data.asList());
        obj.get(0).get(0);

        //data driver testing
    }


    @Given("I enter the url {string}")
    public void iEnterTheUrl(String url) {
        driver.get(url);
        System.out.println("broswer is up");
        System.out.println("title name is: " + driver.getTitle());

        //OpenNewTab("https:www.github.com");
    }

    @When("I click on button")
    public void iClickOnButton() {
        System.out.println("checking the button");
    }

    @When("I click and enter the origin city")
    public void i_click_and_enter_the_origin_city() {
        HomePage p1 = new HomePage();
        p1.clickDepartCityAndGoingCity();




    }


}
