
Feature: Registration functionality
  @register @one
  Scenario: verify wheather the user is able to register after providing all details
    Given I launch the application
    And Navigate to account registration page
    When Provide all below details
      | FirstName | Ravi                |
      | LastName  | Kumar               |
      | Email     | kumarravi@gmail.com |
      | Telephone |          9981827192 |
      | Password  | ravi123             |
    And I select the provacy policy
    And I click on the continue button
    Then I should see the account successfully created