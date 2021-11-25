Feature: Validation of Facebook Webpage
Scenario: validating the facebook with correct username and correct password
Given User should open the fb application
When User enters the username and password in the application 
And User clicks the login button
Then User verifies the application moved to home page