@Testcase7
Feature: as a user
  I would like to be able to remove items from my basket
  so I can buy only those items which I need

  Rule: It is allowed to remove items from the basket

    Background:
      Given open main page
      And accept cookies
      And products are added to the basket

    Scenario: removing items from the basket
      Given language is set to "english"
      When user preses the Add button on the item page
      Then product is disappeared from the basket