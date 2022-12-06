Feature: login
  As a user, I want to able to login with correct username and password


 @smoke
  Scenario: Authorized user can login with correct username and password and verify that the word product is visible

    When user enters correct username and password
    Then the user should login successfully and must verify that the word products is visible
  @smoke
    Scenario: Unauthorized user should not be able to login

      When the user enters incorrect username and password
      Then user should be denied access and the below error message should be displayed and verified
  @regression
      Scenario:Verify title

        Then user should be able to verify the title
@loginWithParameters
    Scenario: login with specified parameters
      Given user is on the login
      When user enters "standard_user" username and "secret_sauce" password
      Then user verifies that the expected title is equal to the actual title


  # To generate dataTable, we just need to use Pipelines

  @form
  Scenario: filling out the form
    Given user is on the form page
    When user enters the following information:
      | fullName       | Joe Biden                                         |
      | email          | joe.biden@gmail.com                               |
      | currentAddress | 1600 Pennsylvania Avenue NW, Washington, DC 20500 |
      | permanentAdd   | 59 Carriage Road Clifton Park New York 12065      |
    And user clicks the submit button
    Then the user should be able to verify the below information:

      | fullName       | Joe Biden                                         |
      | email          | joe.biden@gmail.com                               |
      | currentAddress | 1600 Pennsylvania Avenue NW, Washington, DC 20500 |
      | permanentAdd   | 59 Carriage Road Clifton Park New York 12065      |
