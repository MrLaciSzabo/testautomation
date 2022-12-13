@Testcase9
Feature: as a user
  I would like to be able to open products
  so I can see the details of them

  Rule: It is allowed to remove all of the items from the basket

    Background:
      Given accept cookies
      And open trolley page
      And more than one items in the basket

    Scenario: Removing all items from the basket
      Given language is set to "english"
      Given there are more than one items in the basket
      When user clicks on the Empty trolley button
      Then empty trolley icon displayed