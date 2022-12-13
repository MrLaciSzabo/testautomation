@Testcase10
Feature: as a user
  I would like to be able to log out
  so, no one can use my account on my PC

  Rule: the user is able to sign out from the website

    Background:
      Given open main page
      And accept cookies

    Scenario Outline: Change language
      Given language is set to Engllish
      Given customer is logged in
      When user clicks the Sign ut button
      Then the Sign in button appears
