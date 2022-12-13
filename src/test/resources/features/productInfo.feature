@Testcase8
Feature: as a user
  I would like to be able to open product information page
  so I can see the details of them

  Rule: It is allowed to open product details

    Background:
      Given open main page
      And accept cookies

    Scenario: Open product description
      Given language is set to "english"
      When customer searches for an item
      And opens it
      Then detailed description is shown about the item