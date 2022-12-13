@Testcase6
Feature: as a user
  I would like to have a searchbox
  so I can find items easyier

  Rule: It is allowed to use the search box

    Background:
      Given open main page
      And accept cookies

    Scenario:
      When user searches for an item
      Then results are displayed