Feature: Homepage header
  Description: To validate the homepage header information

  @ADO1234
  @HomePage
  Scenario: Homepage header fields validation

    Given Navigate to homepage
    When Click on home menu
    Then Validate segen logo is displayed
    And Validate search icon is displayed
    And Validate search text field is displayed
    And Validate search button is displayed
    And Validate contact name is displayed