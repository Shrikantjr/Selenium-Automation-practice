package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import spicejet.Pages.HomePage;

public class homepage {

    @When("I click on Departure city and I enter the city name {string}")
    public void iClickOnDepartureCity(){
        System.out.println("hello there");
    }

    @Given("When i enter the url {string}")
    public void whenIEnterTheUrl(String url) {
        HomePage.initialization(url);

    }
}
