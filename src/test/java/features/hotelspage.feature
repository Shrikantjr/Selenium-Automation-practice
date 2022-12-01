Feature: Hotelspage

Background:
  Given I enter the url "https://www.indiabix.com/data-interpretation/table-charts/034001"

  @RegTest
Scenario: Hotel page Validation
    When I click on Hotels
  When i click on hotel search button
    #Then  I verify the title of page