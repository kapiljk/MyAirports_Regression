Feature: Validate the functionality of Guest flow

  @guest @MyAirportRegressionOne
  Scenario: Verify that all functionalities are working fine in guest
   # Given the user clicks on the Guest button on the PreLogin page
    Then the guest successfully navigates to the Home page
    Then the guest clicks on the Special Assistance on the home page
    And verify the Special Assistance page
    And clicks on Back in Special Assistacne page
    Then Verify that the guest is redirected to the home page

   # When the guest is on the Home Page
    When the guest clicks on the Menu button from the Home Page
    Then all the buttons should be displayed in the Menu for guest

    When the guest clicks on the SPECIAL ASSISTANCE feature in the Menu
    Then the guest should be navigated to the SPECIAL ASSISTANCE Page
    When the guest clicks on the Back button on the SPECIAL ASSISTANCE Page
    Then the guest should be navigated back to the Home Page

    When the guest clicks on the Menu button from the Home Page
    And the guest selects the FLIGHTS feature in the Menu
    Then the guest should be navigated to the FLIGHTS Information Page
    When the guest clicks on the Back button on the FLIGHTS Information Page
    Then the guest should be navigated back to the Home Page

    When the guest clicks on the Menu button from the Home Page
    And the guest selects the PROMOTIONS feature in the Menu
    Then the guest should be navigated to the PROMOTIONS Page
    When the guest clicks on the Back button on the PROMOTIONS Page
    Then the guest should be navigated back to the Home Page

    When the guest clicks on the Menu button from the Home Page
    And the guest selects the GENERAL feature in the Menu
    Then the guest should be navigated to the GENERAL Page
    When the guest clicks on the Back button on the GENERAL Page
    Then the guest should be navigated back to the Home Page

    When the guest clicks on the Menu button from the Home Page
    And the guest selects the KEY INFO feature in the Menu
    Then the guest should be navigated to the KEY INFO Page
    When the guest clicks on the Back button on the KEY INFO Page
    Then the guest should be navigated back to the Home Page

    When the guest clicks on the User Profile button on the homepage
    Then the guest navigates to the Login page