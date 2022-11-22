Feature: Homepage

  Background:
    Given I enter the url

  Scenario: Homepage Validation
      When I click on Departure city and I enter the city name "Pune"
      #Then  I verify the title of page


  #Scenario: Homepage ticket booking
  # When I click on Departure city and I enter the city name "Pune"
      #And I enter the Destination city as "Mumbai"
   # And I select the Departure date
     # |Pune|Mumbai|Nanded|Leh|Munnar|

      #Then I click on search flight `button
      #Then I can see the flight details
