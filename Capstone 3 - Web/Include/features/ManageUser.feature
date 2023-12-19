@ManageUserFeature
Feature: Manage User

Background: 
	Given User navigated to Login Page MU1

  Scenario Outline: Access and Display User Details
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Detail User
    And User click eye icon to view detail of user
    Then Verify the Detail User is displayed
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Close User Detail View
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Detail User
    And User click eye icon to view detail of user
    Then User click button Kembali to close the Detail User
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      

  Scenario Outline: Search for a User with Valid Keyword
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Detail User
    And Users input appropriate keywords on Search Field MU1
    Then Verify that the data displayed matches the keywords searched
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Search User Detail Record with Invalid Keyword
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Detail User
    And Users entered invalid keywords on Search Field MU1
    Then Verify that no data with the invalid keyword can be found
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Navigating Through User Pages
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Detail User
    And Users click the arrow icon to navigate or change pages MU1
    Then Verify that the data displayed changes according to the page
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
      
  Scenario Outline: Cancel Adding a New Admin
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And User click button Tambah Admin
    Then User click button Kembali to cancel adding a new admin
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Cancel Editing Admin Data
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And User click icon edit to displayed pop up edit data Admin
    Then User click button Batal to cancel editing an Admin data
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Cancel to Delete an Admin Data
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And User click icon delete to displayed pop up delete Admin
    Then User click button Batal to cancel deleting an Admin data
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Search for an Admin with Valid Keyword
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And Users input appropriate keywords on Search Field MU2
    Then Verify that the data displayed matches the keywords searched MU2
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Search for an Admin with Invalid Keyword
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And Users entered invalid keywords on Search Field MU2
    Then Verify that no data with the invalid keyword can be found MU2
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Navigating Through Admin Pages
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Daftar Admin
    And Users click the arrow icon to navigate or change pages MU2
    Then Verify that the data displayed changes according to the page MU2
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
      
  Scenario Outline: Edit Achievement Details
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Lencana
    And User click icon edit to displayed pop up edit data Achievement
    Then User click button Simpan to editing an Achievement data
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|
      
  Scenario Outline: Cancel Editing Achievement Data
    When User fill <emailMU1> and <passwordMU1> on MU1 field
    And User click Login Button and get directed to Dashboard MU1
    And User click Manage User menu and Lencana
    And User click icon edit to displayed pop up edit data Achievement
    Then User click button Kembali to cancel editing an Achievement data
    
    Examples: 
      | emailMU1        				| passwordMU1 	|
      | superadmin@gmail.com		| 123456				|