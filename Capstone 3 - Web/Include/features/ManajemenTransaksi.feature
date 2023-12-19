@ManajemenTransaksiFeature
Feature: Manajemen Transaksi

Background: 
    Given User navigated to Login Page MT1

  Scenario Outline: Access and Display Voucher Details
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks a voucher to view Voucher Details MT1
    Then Verify the Voucher Detail is displayed MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigate from Voucher Details to Voucher List
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks a voucher to view Voucher Details MT1
    Then User clicks button Kembali to close the Detail Voucher MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Creating A New Voucher
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks button Tambah Voucher MT1
    Then User clicks button Batal to cancel creating a new voucher
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Editing Voucher Content
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks icon Edit to update a voucher detail
    Then User clicks button Batal to close the Update Detail Voucher Page MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Cancel Deleting Voucher Content
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks icon Delete to delete a voucher
    Then User clicks button Batal to close the Delete Pop-Up Voucher MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |

  Scenario Outline: Search for a Voucher with Valid Keyword
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And Users input appropriate keywords on Search Field MT1
    Then Verify that the data displayed matches the keywords searched MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Search for a Voucher with Invalid Keyword
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And Users entered invalid keywords on Search Field MT1
    Then Verify that no data with the invalid keyword can be found MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigating Through Voucher Pages
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And Users click the arrow icon to navigate or change pages MT1
    Then Verify that the data displayed changes according to the page MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
	Scenario Outline: Access and Display Voucher Details on Aktif Tab
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks a voucher to view Voucher Details on Aktif Tab MT1
    Then Verify the Voucher Detail is displayed on Aktif Tab MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
  Scenario Outline: Navigate from Voucher Details to Voucher List on Aktif Tab
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks a voucher to view Voucher Details on Aktif Tab MT1
    Then User clicks button Kembali to close the Detail Voucher on Aktif Tab MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |

	Scenario Outline: Cancel Editing Voucher Content on Aktif Tab
    When User fills <emailMT1> and <passwordMT1> on MT1 field
    And User clicks Login Button and gets directed to Dashboard MT1
    And User clicks Manajemen Misi and Daftar Voucher
    And User clicks icon Edit to update a voucher detail on Aktif Tab
    Then User clicks button Batal to close the Update Detail Voucher Page on Aktif Tab MT1
    
    Examples: 
      | emailMT1                  | passwordMT1 |
      | superadmin@gmail.com      | 123456      |
      
Scenario Outline: Access and Display Voucher Details on Tenggat Tab
    When User
