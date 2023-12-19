@ManajemenMisiFeature
Feature: Manajemen Misi

Background: 
    Given User navigated to Login Page MM1

  Scenario Outline: Access and Display Mission Details
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details MM1
    Then Verify the Mission Detail is displayed MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigate from Mission Details to Mission List
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details MM1
    Then User clicks button Kembali to close the Detail Mission MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Creating A New Mission
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks button Tambah Misi MM1
    Then User clicks button Batal to cancel creating a new mission
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Editing Mission Content
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks icon Edit to update a mission detail
    Then User clicks button Batal to close the Update Detail Mission Page MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Deleting Mission Content
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks icon Delete to delete a mission
    Then User clicks button Batal to close the Delete Pop-Up Mission MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |

  Scenario Outline: Search for a Mission with Valid Keyword
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And Users input appropriate keywords on Search Field MM1
    Then Verify that the data displayed matches the keywords searched MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Search for a Mission with Invalid Keyword
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And Users entered invalid keywords on Search Field MM1
    Then Verify that no data with the invalid keyword can be found MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigating Through Mission Pages
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And Users click the arrow icon to navigate or change pages MM1
    Then Verify that the data displayed changes according to the page MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Access and Display Mission Details on Aktif Tab
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details on Aktif Tab MM1
    Then Verify the Mission Detail is displayed on Aktif Tab MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigate from Mission Details to Mission List on Aktif Tab
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details on Aktif Tab MM1
    Then User clicks button Kembali to close the Detail Mission on Aktif Tab MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |

	Scenario Outline: Cancel Editing Mission Content on Aktif Tab
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks icon Edit to update a mission detail on Aktif Tab
    Then User clicks button Batal to close the Update Detail Mission Page on Aktif Tab MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
Scenario Outline: Access and Display Mission Details on Tenggat Tab
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details on Tenggat Tab MM1
    Then Verify the Mission Detail is displayed on Tenggat Tab MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigate from Mission Details to Mission List on Tenggat Tab
    When User fills <emailMM1> and <passwordMM1> on MM1 field
    And User clicks Login Button and gets directed to Dashboard MM1
    And User clicks Manajemen Misi and Daftar Misi
    And User clicks a mission to view Mission Details on Tenggat Tab MM1
    Then User clicks button Kembali to close the Detail Mission on Tenggat Tab MM1
    
    Examples: 
      | emailMM1                  | passwordMM1 |
      | superadmin@gmail.com      | 123456      |