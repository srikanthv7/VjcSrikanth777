@Register
Feature: As a user, I want to be able to register to the system

  Scenario Outline: Successfully register to the system
    Given I am on home page
    When I click Register link
    When I register with <FirstName>, <LastName>, <Email>, <Mobile>, <Password>
    Then ConfirmRego page is loaded

    Examples: 
      | FirstName | LastName | Email              | Mobile     | Password  |
      | Test      | Name     | testname@test.com  |  041087448 | Test@1234 |
      | Brian     | Son      | BrianTest@test.com | 0424716717 | Tester#1  |
