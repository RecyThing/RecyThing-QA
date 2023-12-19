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
Feature: Main Menu
  I want to Verify Main Menu Function

Background:
Given Iam On Recything Main Menu
  @tag1
  Scenario Outline: Verify All Of Main Menu Page
    When I Click <Element> on Main Menu Page
    Then I <verify3> Element Connect To Main Menu 

    Examples: 
      | Element  | verify3|
      | MainMenu/ProfileButton |    MainMenu/ValidasiProfile | 
      | MainMenu/Notif Button |  MainMenu/Validasi Notif    |
      | MainMenu/Riwayat Button |    MainMenu/Validasi Riwayat | 
      | MainMenu/Tukar Poin Button |  MainMenu/Validasi Voucher    |
      | MainMenu/Daur Ulang Button |    MainMenu/Validasi Daur Ulang | 
      | MainMenu/Pelaporan Button |  MainMenu/Validasi Pelaporan    |
      | MainMenu/Mission Button |    MainMenu/Validasi Missions | 
      | MainMenu/Komunitas Button |  MainMenu/Validasi Community    |
      | MainMenu/Carousel1 |    MainMenu/Validasi Carousel | 
      | MainMenu/RecyBot Button |    MainMenu/Validasi RecyBot | 
      
      @tag2
  Scenario Outline: Verify Article On Main Menu
    When I Click <Article> Articles on Main Menu
    Then I <verify4> Article Connect To Main Menu
    
      Examples: 
    | Article  | verify4|
      | MainMenu/Card |    MainMenu/Validasi Artikel1 | 
      | MainMenu/Lihat Semua Button |  MainMenu/Validasi Lihat Semua    |
      
      @tag3
  Scenario: Verify Beranda Button on Main Menu
    When I Click Beranda Button
    Then I verify Beranda Button