@Testcase2
Feature: as a user
  I would like to be able to change the website's language
  so, I can read the site in that language, which is the most comfortable for me

  Rule: It is allowed to change the language

    Background:
      Given already opened main page
      And clear cookie cache
      And accept cookies

    Scenario: Change the language to english
      Given language is set to hungarian
      When change the language to english
      Then it shows elements in english language