@PelaporanFeature
Feature: Pelaporan

Background: 
	Given User navigated to Login Page P1

  Scenario Outline: Access and Display Report Details on All Report Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar
    And User click eye icon to view Report Details P1
    Then Verify the Report Detail is displayed P1
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Report Details to Report List on All Report Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar
    And User click eye icon to view Report Details P1
    Then User click button Kembali to close the Detail Report P1
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
Scenario Outline: Search for a Report with Valid Keyword
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar
    And Users input appropriate keywords on Search Field P1
    Then Verify that the data displayed matches the keywords searched P1
    
    Examples: 
      | emailP1                   | passwordP1 |
      | superadmin@gmail.com      | 123456     |
      
Scenario Outline: Search for a Report with Invalid Keyword
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar
    And Users entered invalid keywords on Search Field P1
    Then Verify that no data with the invalid keyword can be found P1
    
    Examples: 
      | emailP1                   | passwordP1 |
      | superadmin@gmail.com      | 123456     |
      
Scenario Outline: Navigating Through Report Pages
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar
    And Users click the arrow icon to navigate or change pages P1
    Then Verify that the data displayed changes according to the page P1
    
    Examples: 
      | emailP1                   | passwordP1 |
      | superadmin@gmail.com      | 123456     |

      
      
  Scenario Outline: Access and Display Report Details on Need Review Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Perlu Tinjauan
    And User click eye icon to view Report Details P2
    Then Verify the Report Detail is displayed P2
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Report Details to Report List on Need Review Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Perlu Tinjauan
    And User click eye icon to view Report Details P2
    Then User click button Kembali to close the Detail Report P2
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Cancel Approving a Report
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Perlu Tinjauan
    And User click button Setujui
    Then User click button Kembali to cancel approving a report P2
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Cancel Rejecting a Report
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Perlu Tinjauan
    And User click button Tolak
    Then User click button Kembali to cancel rejecting a report P2
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|

  Scenario Outline: Access and Display Report Details on Approved Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Disetujui
    And User click eye icon to view Report Details P3
    Then Verify the Report Detail is displayed P3
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Report Details to Report List Approved Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Disetujui
    And User click eye icon to view Report Details P3
    Then User click button Kembali to close the Detail Report P3
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
      
  Scenario Outline: Access and Display Report Details on Rejected Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Ditolak
    And User click eye icon to view Report Details P4
    Then Verify the Report Detail is displayed P4
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Report Details to Report List on Rejected Tab
    When User fill <emailP1> and <passwordP1> on P1 field
    And User click Login Button and get directed to Dashboard P1
    And User click Pelaporan on the sidebar and tab Ditolak
    And User click eye icon to view Report Details P4
    Then User click button Kembali to close the Detail Report P4
    
    Examples: 
      | emailP1        				| passwordP1 	|
      | superadmin@gmail.com	| 123456			|