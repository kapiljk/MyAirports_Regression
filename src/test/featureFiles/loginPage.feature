Feature: Login and Logout Functionality

  @login @MyAirportRegressionOne
  Scenario: Verify Successful Login with Valid Credentials
    Then the user successfully navigates to the Home page

  @login @MyAirportRegressionOne
  Scenario: Logout Functionality
    And the user clicks on the user account
    Then the user navigates to the user profile page
    And clicks on the Logout button
    Then the user navigates to the Logout page
    And clicks on the Yes button to Logout
    Then navigates to the home page with successfully logged out

  @login @MyAirportRegressionThree
  Scenario: Validate the functionality of google login
    Then the user click on the login with google button
    And the user enter email or phone number in the text field and click next
    And the user enter password in the text field and click next
    Then verify that user land on application home page.

