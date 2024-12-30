Feature: Validate the functionality of Essential Services flow

  @essentials @MyAirportRegressionOne
  Scenario: Verify that all functionalities are working fine in EssentialServices
    Given the user clicks on the Essential Services button on the home page
    Then the user navigates to the Essential Services page
    And clicks on the terminal dropdown to change the terminal in the Essential Services page
    Then clicks on any of the Services from the Services list
    And verifies that the user navigates to the same Service page
    Then clicks on the favorite to add to favorites in Service details page
    Then verifies the Rating Review text in the POI Service details page
    Then verifies the Take Me There text in the POI Service details page
    And verifies the back arrow icon in the POI Service details page
    And clicks on the back arrow icon in the POI Service details page
    Then verifies that the Essential Service page is displayed
    And verifies the back arrow icon in the Essential Service page and clicks on the back arrow icon
    Then verifies that it takes the user to the home page from Essential Service page
