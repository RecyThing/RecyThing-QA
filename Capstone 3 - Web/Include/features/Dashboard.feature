@DashboardFeature
Feature: Dashboard

Background: 
	Given User navigated to Login Page D1

  Scenario Outline: Verify Close or Hide Sidebar
    When User fill in <emailD1> and <passwordD1> on D1 field
    And User click Login Button and get directed to Homepage
    And User click pointer to hide the sidebar
    Then Verify the dashboard is displayed with a minimized sidebar
    
    Examples: 
      | emailD1        					| passwordD1 	|
      | superadmin@gmail.com		| 123456			|
      
  Scenario Outline: Navigated Dashboard to the Download Page
    When User fill in <emailD1> and <passwordD1> on D1 field
    And User click Login Button and get directed to Homepage
    And User click download button
    Then User directed to the Download Page
    
    Examples: 
      | emailD1        					| passwordD1 	|
      | superadmin@gmail.com		| 123456			|
      

  Scenario Outline: Navigated Back from Download Page to Dashboard
    When User fill in <emailD1> and <passwordD1> on D1 field
    And User click Login Button and get directed to Homepage
    And User click download button
    And User click button kembali
    Then User directed back from Download Page to Dashboard
    
    Examples: 
      | emailD1        					| passwordD1 	|
      | superadmin@gmail.com		| 123456			|