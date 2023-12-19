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
Feature: OnBoarding
  I want Verify OnBoarding Screen
  
  Background:
  Given I Open RecyThing Application OnBoarding

  @tag1
  Scenario: Verify Selanjutnya Button
    When I Click Selanjutnya Button
    Then I verify Next Page OnBoarding Page
  @tag2
  Scenario: Verify Login Button
    When I Click Selanjutnya Button Until End Page 1
    Then I verify Login Button
  @tag3
  Scenario: Verify Register Button
    When I Click Selanjutnya Button Until End Page 2
    Then I verify Register Button
  @tag4
  Scenario: Verify Lewati Button
    When I Click Lewati Button
    Then I verify Lewati Button
