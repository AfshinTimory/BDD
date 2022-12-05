Feature: cart function
  As a user, I would like to verify the cart functionality

  Scenario: Authorized user should be able to verify cart functionality
    Given  user is on the login
    When user enters correct username and password
    And user clicks on the Backpack item1
    And user clicks on the Bike item2
    And user clicks on the shirt item3
    And user clicks the cart
    And user gets total items existing in the cart
    Then the total number of items existing in the cart should match the actual items number
