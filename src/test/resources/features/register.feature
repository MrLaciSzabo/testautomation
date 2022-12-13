@Testcase3
Feature: as a user
  I would like to be able to register
  so I can purchase in the webshop

  Rule: the user is able to register using valid email format and password combination

    Scenario: register using correct email format and password combination
      Given already opened register page
      When user fills the Email address field with valid email format
      And user fills the Password filed with valid password format
      And user fills the Confirm password filed with valid password format
      And the user clicks the Next button

