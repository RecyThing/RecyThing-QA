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
Feature: Drop Point
  I want to Use Drop Point Feature
Background:
Given I am On Daur ulang page


@tag1
Scenario: Verify Tukar Sampah Mu Card
When I Click Tukar sampah mu card
    Then I Verify Tukar sampah card

  @tag2
  Scenario Outline: Search Drop Point with All Condition 
    
    When I Search <DPK> on Drop Point
    Then I <verify8> Search Drop Point

    Examples: 
      | DPK  | verify8  | 
      |  |   DropPoint/Validasi Empty Search   | 
      | ubud |  DropPoint/Validasi With Keyword Ubud    | 
      | marshajkt |  DropPoint/Validasi Random Keyword    | 
      
      