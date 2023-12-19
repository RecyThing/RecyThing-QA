#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Menu Profile
  I want to User Menu Profile Feature
  
  Background: 
   Given Iam On Menu Profile
   
  @tag1
  Scenario: Empty Date Of Birth
    When Input All Data Except Date Of Birth
    Then I verify Empty Date Of Birth
    
    @tag2
  Scenario: Change Email Disable
    When Change Email Disable
    Then I verify Can't Change email

  @tag3
  Scenario Outline: Change Profile with All Condition Without Change Email and Empty Date of birth
   
    When I Input <Fullname> and than <address> Data on Change Profile
    Then I verify the <verify5> in step

    Examples: 
      | Fullname  | address | verify5 |
      | Jiddan QA Handal |     JL. Mamang Koral | Menu Profile/Profile saya Folder/Validasi Berhasil |
      | Jiddan QA |     JL. Koral| Menu Profile/Profile saya Folder/Validasi Berhasil |
      | Jiddan QA |    | Menu Profile/Profile saya Folder/Validasi Empty  |
      |  |  JL. Koral| Menu Profile/Profile saya Folder/Validasi Empty  |
      
      @tag4
  Scenario Outline: Change Password With all Condition Without verify eye icon and Back Button
   
    When I Input <PresentPass> and than <NewPass> and than <ConfirmPass> Data on Change Profile
    Then I verify the <verify6> in step6

    Examples: 
      |  PresentPass | NewPass | ConfirmPass  |  verify6 |
      | 12345678 |  123456789 | 123456 | Menu Profile/Ubah Password/Validasi Gagal |
      | 12345678 |  123456789| 123456789 |Menu Profile/Ubah Password/Validasi berhasil  |
      |  |    |   | Menu Profile/Ubah Password/Validasi Gagal  |
      |  |  12345678 |  12345678  | Menu Profile/Ubah Password/Validasi Gagal |
      | 12345678 |   |  12345678  | Menu Profile/Ubah Password/Validasi Gagal |
      | 12345678 | 12345678  |    | Menu Profile/Ubah Password/Validasi Gagal |
      
      @tag5
  Scenario: Verify All Eye Icon
    When Input Password on Change Password
    And Click Eye Icon on Change Password
    Then I verify All Eye Icon on Change Password
    
     @tag6
  Scenario: Verify Back Button On Change Password
    When Click Back Button On Change Password
    Then I verify Back button on Change Password
    
    @tag7
  Scenario: Verify Lencana Button
    When Click Lencana Button
    Then I verify Lencana Feature
    
    @tag8 
  Scenario: Verify RecyBot Button
    When Click RecyBot Button on Menu Profile
    Then I verify RecyBot on Menu Profile
    

    @tag9
  Scenario Outline: Search FAQ with All Condition
    When I Input <SearchFAQ> on FAQ
    Then I verify the <verify7> in step7

    Examples: 
      |  SearchFAQ | verify7 |
      | daur ulang | Menu Profile/FAQ/Validasi Search with word daur ulang   |
      | Marsha JKT48 | Menu Profile/FAQ/Validasi  | 
      |  |  Menu Profile/FAQ/Validasi  | 
      
      @tag10
  Scenario: Verify Selengkapnya Function on FAQ
    When Click FAQ Button
    And Click Selengkapnya Button
    Then I verify Selengkapnya FAQ on Menu Profile
    
    @tag11
  Scenario: Verify Back Button On Menu Profile
    When Click Back Button On Menu Profile
    Then I verify Back Button On Menu Profile
    
    
    
    