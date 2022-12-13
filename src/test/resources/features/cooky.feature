@Testcase1
Feature: as a user
  I would like to accept or reject cookies
  so, the use of the website will be more comfortable

  Rule: It is allowed to accept or reject the cookies

    Background:
      Given clear cookie cache
      And open main page

    Scenario: accept cookies
      Given accept cookies