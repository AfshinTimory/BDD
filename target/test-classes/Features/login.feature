Feature: login
  As a user, I want to able to login with correct username and password



  Scenario: Authorized user can login with correct username and password and verify that the word product is visible

    When user enters correct username and password
    Then the user should login successfully and must verify that the word products is visible

    Scenario: Unauthorized user should not be able to login

      When the user enters incorrect username and password
      Then user should be denied access and the below error message should be displayed and verified

      Scenario:

        Then user should be able to verify the title