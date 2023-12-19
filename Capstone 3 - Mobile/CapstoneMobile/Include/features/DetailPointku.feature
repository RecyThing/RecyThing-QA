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
Feature: Detail Point Ku Feature
  I Want to User Detail Point Ku Feature

Background:
Given I am On Detail Point Ku Page
  @tag1
  Scenario: Collect Daily Point
    When I Click Kumpulkan Point
    Then I Verify Kumpulkan Point
    
     @tag2
  Scenario: Empty Number Phone
    When I Click Tukar Voucher
    And I Fill Number Phone On Tukar Voucher
    Then I Verify Empty Number Phone
    
      @tag3
  Scenario: Redeem Voucher
    When I Click Tukar Voucher2
    And I Fill Number Phone On Tukar Voucher2
    Then I Verify Redeem voucher
    
    #@tag4
  #Scenario: See Detail Riwayat
    #When I Click Riwayat
    #And I Click Card Riwayat
    #Then I Verify Riwayat 
    
    @tag5
  Scenario: Verify Back To Main Menu
    When I Click Tukar Voucher3
    And I Fill Number Phone
    And I Click Back To Main Menu Button On Voucher Success
    Then I Verify Back to Main Menu Button 
    
     @tag6
  Scenario: Batal Tukar Point
    When I Click Tukar Voucher4
    And I Click Batal Button
    Then I Verify Batal Tukar Voucher
    
    @tag7
    Scenario: Verify Disable Tukar Point When Point Less Than Term
    Given Iam On Tukar Point Page with Less than Point
    When I Click Disable Tukar Button
    Then I Verify Disable Tukar Button
    
    @tag8
    Scenario: Verify Riwayat Button
    When I Click Riwayat Button
    Then I Verify Riwayat Button
    
    
    
