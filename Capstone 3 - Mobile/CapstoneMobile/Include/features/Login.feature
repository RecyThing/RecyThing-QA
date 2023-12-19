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
Feature: Login
  I want to Verify Login Feature
  
  Background:
  Given I Start RecyThing Application Login 

  @tag1
  Scenario Outline: Login With Different Steps
    
    When I Input <email> On Email Field
    And I Input <password> On Password Field
    Then I <verify> Login Function

    Examples: 
      | email | password | verify |
      |  |   Jiddan  | Login Page/Validasi Field Email Kosong |
      |  |   |  Login Page/Validasi Password Field Kosong |
      | ahmad@example.com |   |  Login Page/Validasi Password Field Kosong   |
      | ahmada@example.com | Jiddan |  Login Page/Validasi Email tidak Valid   |
      | ahmadexample.com | Jiddan  |  Login Page/Validasi Email tidak Valid   |
      
      
 @tag2
 Scenario: Verify Atur Ulang Password
 When I Tap Atur Ulang Button
    Then I verify Atur Ulang Function Function
    
    @tag3
 Scenario: Verify Eye Icon
 When I Input On Password Field
    And I Tap Eye Icon On Login
    Then I verify Eye Icon Function
    
    @tag4
 Scenario: Verify Register Button Function
 When I Tap Register Button On Register Button
    Then I verify Register Function On Login
    
     @tag5
 Scenario: Verify Login With Correct Data
 When I Input Email With Correct Data On Login
 And I Input Correct Password
    Then I verify RecyThing Login Function On Login
 
 