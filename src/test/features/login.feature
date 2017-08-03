@Login

Feature: 
  As a user, I want to be able to login to the website

  Scenario Outline: Successful login with valid credentials
    Given I am on home page
    When I click Signin link
    When I login with <email> and <password>
    Then Dashboard page is loaded

    Examples: 
      | email                   | password       |
      | revolutionit1@gmail.com | Revolutionit#7 |
      | osbcweagree11@gmail.com | Monday11       |
