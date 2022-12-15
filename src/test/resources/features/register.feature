@Testcase3
Feature: as a user
  I would like to be able to register
  so I can purchase in the webshop

  Rule: the user is able to register using valid email format and password combination

    Scenario: register using correct email format and password combination
      Given homepage is opened
      And cookies are set
      When user registers

