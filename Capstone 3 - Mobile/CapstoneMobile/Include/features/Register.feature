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
Feature: Register
  I want to Register Account
  
  Background:
  Given I am On Register Page

  @tag1
  Scenario Outline: Verify Register with All Condition
    When I Input All Of <name> and <email> and <password> and <confirm> Field
    And I click Button Registers
    Then I <verify> Register

    Examples: 
      | name  | email  | password  | confirm | verify |
      | jiddan |  jiddan@example.com | 12345678 | 12345678  | Register Page/Valid Register |
      | jiddan |  jiddan@example.com | 12345678   | 123456789  | Register Page/Validasi Akun tidak Valid |
      | jiddan |   | 12345678   | 123456789  | Register Page/Validasi Email |
      | |   |    |   | Register Page/Validasi Fullname |
      | |  jiddan@example.com | 12345678   | 123456789  | Register Page/Validasi Fullname |
      | jiddan |  jiddan@example.com |   | 123456789  | Register Page/ValidasiPass |
      | jiddan |  jiddan@example.com | 12345678   |   | Register Page/ValidasiConfirm |
      | recything |  ahmad@example.com | 12345678   | 12345678  | Register Page/Validasi Akun tidak Valid |
      | jiddan |  jiddanexample.com | 12345678   | 123456789  | Register Page/Validasi Akun tidak Valid |
      
  @tag2
  Scenario Outline: Verify Kebijakan Privasi, Ketentuan Layanan and Login Button
    When I Click <tombol> on Buttons
    Then I <verify1> per Button

    Examples: 
      | tombol  | verify1  | 
      | Register Page/Login Button On Register|  OnBoarding Object/Validasi Login   |  
      | Register Page/Kebijakan Privasi |   Register Page/Validasi Privacy Police and term and Condition  |
      | Register Page/Ketentuan Layanan Button (1)  | Register Page/Validasi Privacy Police and term and Condition  |
       
      
  @tag3
  
  Scenario: Verify Eye Icon
    When I Input Password 1
    And I Input Password 2
    Then I Verify Password can see
  
      
      
  
      
   