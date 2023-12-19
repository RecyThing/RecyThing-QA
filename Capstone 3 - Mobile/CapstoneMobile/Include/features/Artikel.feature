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
Feature: Artikel Daur Ulang 
  I want User Artikel Daur Ulang
  
Background:
Given I am On Artikel Page

  @tag1
  Scenario Outline: Search With All Condition
    
    When I <SearchArtikel> one of Artikel
    Then I <verify9> Artikeles

    Examples: 
      | SearchArtikel  | verify9 |
      | Elektronik |  Article/Validasi Empty Search  | 
      | Marshaaa |  Article/Validasi Random Keyword   |
      |   |   Article/Validasi Empty Search   |
      
      @tag2
      Scenario: Verify Lihat semua kateogori Function
      When I Click Lihat Semua Kategori Function
    Then I Verify Lihat Semua Kategori Function
    
    @tag3
      Scenario: Verify Lihat semua Artikel Populer Function
      When I Click Lihat Semua Artikel Populer Function
    Then I Verify Lihat Semua Artikel Populer Function
    
     @tag4
      Scenario: Verify Click One Category
      When I Click One Category Function
    Then I Verify One Category Function
    
    @tag5
      Scenario: Verify Artikel Terbaru Button
      When I Click Lihat Semua Artikel Populer Function2
      And I Click Terbaru Button
    Then I Verify Lihat Semua Artikel Populer Function2
    
    @tag6
      Scenario: Verify Artikel Terbaru Button
      When I Click Lihat Category Daur Ulang
      And I Choose Elektronik Kategori
    Then I Verify can See Artikel Elektronik
    
    @tag7
      Scenario: Verify Artikel Terbaru Button
      When I Click Lihat Category Daur Ulang2
      And I Choose Elektronik Kategori2
      And I Click Like Button
    Then I Verify Like Function
    
    
    
    
   