Feature: Exciting News functionality

  @pre-loginNews @MyAirportRegressionOne
  Scenario: Validate functionalities of News in prelogin page
    When verify that exciting news present on the prelogin page
    And the user clicks on the Read More link
    Then verify the user navigates to the exciting news page
    And clicks on the back arrow icon in the exciting news page
    And verify the user navigated to preloginpage










