package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import spicejet.Basepage.TestBase;
import spicejet.Pages.HomePage;

public class homepageSteps extends TestBase {
    HomePage p1 = new HomePage(driver);

//    @And("I select the Departure date")
//    public void iSelectTheDepartureDate(DataTable data) {
//        List<List<String>> obj = Collections.singletonList(data.asList());
//        obj.get(0).get(0);
//
//        //data driver testing
//    }


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
        p1.getValue("Ayush");

    }


    @When("I click on Hotels")
    public void iClickOnHotels() {


        /*
        HomePage p1 = new HomePage();
        p1.clickByHotels();

         */
    }

    @When("i see the logs")
    public void iSeeTheLogs() {
        p1.homepageLogo();
    }
//
//    @When("i get the value")
//    public void iGetTheValue() {
//        HomePage p1 = new HomePage();
//        p1.getValue("Ayush");
//    }

    @When("i get the value")
    public void i_get_the_value() {
        p1.clickDepartCity();
        // Write code here that turns the phrase above into concrete actions

    }

}
