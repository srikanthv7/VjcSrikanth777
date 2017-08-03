Feature: Title of your feature
	As a user i want to click and eneter the email id when i forget password

Scenario Outline: Forget password

       Given I am on home page
       When I click Login link
       When I click on Forget password link
       And system is navigated to PasswordReset page
       And I enter my email id
       And click on send email
       Then i should see a acknowledgement message
       
       Examples:
       | Email                                |
       | srikanth.velpula@revolutionit.com.au |
       
