Feature: Special Assistance Flow

  @specialAssistance @MyAirportRegressionOne
  Scenario: Special Assistance workflow
    Given the user clicks on the Special Assistance on the home page
    And Verify the Special Assistance page
    Then Clicks on the Travel with children
    And Verify the Travel with children page
    Then Clicks on the Baby Care Room
    And Verify Baby Care Room expanded
    Then Clicks on the Unaccompanied Minor Service
    And Verify Unaccompanied Minor Service expanded
    And Clicks on Back in travel with children page
    Then Clicks on the Assistance for a person
    And Verify Assistance for a person page
    Then Clicks on the Hidden Disabilities
    And Clicks on Back in the Assiatnce for a person page
    Then Clicks on Others in Special Assiatnce page
    And Verify Others page
    Then CLicks on the Medical Services in Others page
    And Clicks on the Airlines Assistance in Others page
    And Clicks on Back in Others page
    And Clicks on Back in Special Assistacne page
    Then Verify that the user is redirected to the home page



