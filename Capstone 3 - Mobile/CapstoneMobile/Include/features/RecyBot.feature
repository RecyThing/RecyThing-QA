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
Feature: RecyBot
  I want to Ask RecyBot

Background:
Given Iam On RecyBot Page
  @tag1
  Scenario Outline: Ask RecyBot
    When I Ask <Question> on RecyBot
    And I Click Send Button on RecyBots
    Then I <verify2> the Answer of RecyBot

    Examples: 
      | Question  | verify2 | 
      | Cara Mendaur Ulang sampah |   RecyBot/Validasi Recy | 
      |  |   RecyBot/Validasi Recy |
      | Siapakah Marsha JKT48 |  RecyBot/Validasi Recy | 
      
   @Tag2
   Scenario: Ask RecyBot With 5 Question Together
   When I ask 5 Question Together
   And I click Send Button On Bot
   Then I verify the Answer
   
   