@LoginFeature
Feature: Login

  Background: 
	Given User navigated to Login Page
	
	Scenario Outline: Login with Invalid Credentials
    When User input <emailL1> and <passwordL1>
    And User click Login Button
    Then User get Error Message on Login
    
    Examples: 
      | emailL1        				| passwordL1 		|
      | superadmin@gmail.com	| indomie				|
      | winandasinaga22@gmail.com		| indomie12345	|
      | ifs20015.winanda@gmail.com	| indomie12345	|
      
	Scenario Outline: Login with Valid Credentials
    When User input <passwordL1> and <passwordL1>
    And User click Login Button
    Then User get directed to Homepage
    
    Examples: 
      | emailL1        							| passwordL1 		|
      | winandasinaga22@gmail.com		| indomie				|