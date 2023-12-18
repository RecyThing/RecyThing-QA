@LoginFeature
Feature: Login

  Background: 
	Given User navigated to Login Page
      
	Scenario Outline: Login with Valid Credentials
		When User input <email> and <password>
    And User click Login Button
    Then User get directed to Homepage
    
    Examples: 
      | email        					| password 	|
      | superadmin@gmail.com	| 123456		|