Feature: Auto Quote Tests

  Background: 
    Given user is in HomePage

  Scenario: Validate the Auto Quote for Valid and Acceptable credit user
    Given zipcode placeholder '5-Digit ZIP Code'
    When user enters zipcode <zipcode>
    When user clicks lob <lob>
    Then Validate startMyQuote titles
    When user clicks startMyQuote button
    Then user is in BundlePage
    When user clicks continue button
    Then user is in AboutYouPage
    And DOB title is 'Date of Birth'
    When user clicks dob textbox
    Then zipcode assist message display 'Please enter date as MM/DD/YY and select "Next" to continue'
    When user clicks Next button
    Then zipcode required error message display 'Date of Birth is Required'
    When enter DOB <dob>
    And user clicks Next button
    Then user is in TellUsAboutYourselfPage
    And firstName title is 'First Name'
    And lastName title is 'Last Name'
    When user clicks Next button
    Then firstName required error message display 'First Name is Required'
    And lastName required error message display 'Last Name is Required'
    When user enters firstName <firstName>
    And user enters lastName <lastName>
    And user clicks Next button
    Then user is in AddressPage
