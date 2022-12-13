@Testcase5
Feature: as a user
  I would like to be able to put items to my basket
  so, later when I finished shopping I can purchase them

  Rule: It is allowed to add items to the basket

    Background:
      Given open main page
      And accept cookies

    Scenario: Adding items to the basket
      Given language is set to "english"
      When user preses the Add button on the item page
      Then products are displayed in the basket