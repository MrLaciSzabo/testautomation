@Testcase4
Feature: as a user
  I would like to be able to login to Tesco webshop
  so I can add

  Rule: able to login using correct username and password

    Background:
      Given open the main page
      And accept cookies
      And the language is set to "english"
      And login page opened

    Scenario: login denied
      Given already opened login page
      When fill the e-mail field with invalid data
      And fill the password filed with invalid data
      And press the Login button
      Then an "Error" message appears on the login page

    Scenario: login with correct username and password
      Given already opened login page
      When fill the e-mail field with valid data
      And fill the password filed with valid data
      And press the Login button
      Then the trolley icon and Checkout button appears on the main page