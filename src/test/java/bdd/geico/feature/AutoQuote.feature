Feature: Auto Quote Tests

  Scenario: Validate the Auto Quote for Valid and Acceptable credit user
    Given user in homepage
    And user is a valid user
    And user has acceptable credit
    When user complete auto quote
    Then user will get a quote number
    And user will get quote amount
