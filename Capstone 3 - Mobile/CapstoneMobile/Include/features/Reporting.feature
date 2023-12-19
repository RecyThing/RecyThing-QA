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
Feature: Reporting
  I want to use Reporting Feature
  
  Background:
  Given I am On Pelaporan Page
  

  @tag1
  Scenario Outline: Report Rubbish with Empty Condition Without Empty Maps and Foto
    
    When I Input Data With <LokasiPatokan> ands <KondisiSampah> On Report Rubbish
    Then I verify the result with empty lokasi patokan and asmpah

    Examples: 
      | Lokasi Patokan | Kondisi Sampah  |
      | | sampah menumpuk sudah 10 hari |
      |  Samping Rumah Mamang |     |
      
 @tag2
 Scenario: Report Rubbish With Empty Maps
 When I Don't Input Maps
    Then I verify the result of Empty Maps
    
    @tag3
 Scenario: Report Rubbish With Empty Photo
 When I Don't Input Photo
    Then I verify the result of Empty Photo
    
    @tag4
 Scenario: Report Rubbish With Correct Data
 When I Input Correct data on Report Rubbishes
    Then I verify the result of Correct Data on Report Rubbishes
    
    @tag5
 Scenario: Report Rubbish With Upload More Than 20 MB Media
 When I Input Media More than 20 MB
    Then I verify the result of Upload Media More Than 20 MB
    
    @tag6
 Scenario: Report Rubbish With Search Location On Map
 When I Input Search Location
    Then I verify the result of Search Location
    
    @tag7
 Scenario: Report Rubbish With Search Location With Random Keyword
 When I Input Random Keyword On Search Location
    Then I verify the result of Search Location With Random Keyword
    
    @tag8
 Scenario: Verify Explanation Of Individual Littering
 When I verify Explanation Of Individual Littering
    Then I verify the result of Explanation Individual Littering
    
    @tag9
 Scenario: Verify Explanation Of Company Littering
 When I Click Explanation Of Company Littering
    Then I verify the result of Explanation Company Littering
    
    @tag10
  Scenario Outline: Report Littering Individu All Condition
    When I Input Data With <LokasiPatokan2> ands <KondisiSampah2> On Report Littering
    Then I verify the result with Littering Individu All Condition
    Examples: 
      | Lokasi Patokan2 | Kondisi Sampah2  |
      | Samping Rumah Mamang | sampah menumpuk sudah 10 hari |
      |   |     |
    
    @tag11
  Scenario Outline: Report Littering Company All Condition
When I Input Data With <LokasiPatokan3> ands <KondisiSampah3> ands <NamaPT> On Report Littering2
    Then I verify the result with Littering Company All Condition

    Examples: 
      | Lokasi Patokan3 | Kondisi Sampah3 | NamaPT |
      | Samping Rumah Mamang | sampah menumpuk sudah 10 hari | PT.Cinta Ditolak Emang Nggak Enak |
      |   |     |   |
    