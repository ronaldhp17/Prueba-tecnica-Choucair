#Author: Ronald David Herazo Parra

@stories
Feature: Signup utest
  As a user, I want to automate the registration process of a user in utest

  @scenario1
  Scenario Outline: Fill out registration form
    Given than Ronald wants register at utest
    When he fill the fields
      | firstName   | lastName   | email   | language   | city   | zipCode   | birthMonth   | birthDay   | birthYear   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <language> | <city> | <zipCode> | <birthMonth> | <birthDay> | <birthYear> | <password> | <confirmPassword> |
    Then he completes the registration and redirects to home page
      | homePage   |
      | <homePage> |
    Examples:
      | firstName | lastName | email             | language | city      | zipCode | password        | confirmPassword | birthMonth | birthDay | birthYear | homePage                                                                |
      | Ronald    | Herazo   | ronald1@signup.com | Spanish  | Sincelejo | 700001  | pruebaUtest1234 | pruebaUtest1234 | April      | 17       | 1997      | Welcome to the world's largest community of freelance software testers! |
