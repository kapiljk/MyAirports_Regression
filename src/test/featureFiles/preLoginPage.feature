Feature: PreLogin functionality

  @pre-login @MyAirportRegressionOne
  Scenario: Verify All Functionalities in prelogin
    When the user clicks on BAHASA MALAYSIA in the Prelogin Page
    And verifies that the app language changes in malasia language
    Then the user clicks on CHINESE in the Prelogin Page
    And verifies that the app language changes in chinese language
    And the user clicks on ENGLISH in the Prelogin Page
    Then verifies that the app language changes in english language

    When the user select the BKI-Kota Kinabalu from the dropdown in Prelogin Page
    And Verify terminal selected as BKI
    Then the user select the KCH-Kuching from the dropdown in Prelogin Page
    And Verify terminal selected as KCH
    Then the user select the PEN-Penang from the dropdown in Prelogin Page
    And Verify terminal selected as PEN
    Then the user select the Terminal2 from the dropdown in Prelogin Page
    And Verify terminal selected as Terminal2
    Then the user select the Terminal1 from the dropdown in Prelogin Page
    And Verify terminal selected as Terminal1
    Then clicks on the Submit button in Prelogin Page



