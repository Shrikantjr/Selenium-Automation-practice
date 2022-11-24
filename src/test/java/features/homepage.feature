Feature: Homepage

  Background:
    Given I enter the url "https://www.yatra.com"

  @RegTest
  Scenario: Homepage Validation
    When I click and enter the origin city
    #Then  I verify the title of page

  @RegTest
  Scenario: Homepage ticket booking
  When I click on Hotels

  # When I click on Departure city and I enter the city name "Pune"
      #And I enter the Destination city as "Mumbai"
   # And I select the Departure date
     # |Pune|Mumbai|Nanded|Leh|Munnar|

