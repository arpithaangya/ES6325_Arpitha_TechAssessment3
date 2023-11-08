Feature: Login Page of Demo Web Shop

Background:  Given User opens the demo web shop
  @ValidCredentials
  Scenario: Checking with valid 
   Given User goes to login page
    When User enters email and password
    And Clicks on Login 
		Then User will login or fail
 

  @InvalidCredentials
  Scenario: Checking with invalid 
 Given User goes to login page
    When User enters email and password
    And Clicks on Login 
		Then User will login or fail
