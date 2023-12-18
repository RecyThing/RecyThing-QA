@KontenDanInformasiFeature
Feature: Konten Dan Informasi

Background: 
	Given User navigated to Login Page K1

  Scenario Outline: Access and Display Article Details
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And User click an article view Article Details K1
    Then Verify the Article Detail is displayed K1
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Article Details to Article List
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And User click an article view Article Details K1
    Then User click button Kembali to close the Detail Article K1
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Cancel Editing Article Content
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And User click an article view Article Details K1
    And User click button Ubah to update an article detail
    Then User click button Batal to close the Update Detail Article Page K1
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Cancel Deleting Article Content
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And User click an article view Article Details K1
    And User click button Ubah to update an article detail
    And User click button Hapus 
    Then User click button Batal to close the Delete Pop Up Article K1
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|

  Scenario Outline: Search for an Article with Valid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And Users input appropriate keywords on Search Field K1
    Then Verify that the data displayed matches the keywords searched K1
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Search for an Article with Invalid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And Users entered invalid keywords on Search Field K1
    Then Verify that no data with the invalid keyword can be found K1
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Navigating Through Article Pages
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Konten Artikel
    And Users click the arrow icon to navigate or change pages K1
    Then Verify that the data displayed changes according to the page K1
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
      
	Scenario Outline: Cancel Editing Trash Category
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Kategori Sampah
    And User click icon edit to editing Trash Category
    Then User click Batal to cancel editing Trash Category
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Cancel Deleting Trash Category
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Kategori Sampah
    And User click icon delete to deleting Trash Category
    Then User click button Batal to close the Delete Pop Up Trash Category
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Search for a Trash Category with Valid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Kategori Sampah
    And Users input appropriate keywords on Search Field K2
    Then Verify that the data displayed matches the keywords searched K2
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Search for a Trash Category with Invalid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Kategori Sampah
    And Users entered invalid keywords on Search Field K2
    Then Verify that no data with the invalid keyword can be found K2
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Navigating Through Trash Category Pages
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Kategori Sampah
    And Users click the arrow icon to navigate or change pages K2
    Then Verify that the data displayed changes according to the page K2
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  
	Scenario Outline: Access and Display Drop Point Details
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And User click a Drop Point view Drop Point Details
    Then Verify the Drop Point Detail is displayed
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
  Scenario Outline: Navigate from Drop Point Details to Drop Point List
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And User click a Drop Point view Drop Point Details
    Then User click button Kembali to close the Detail Drop Point
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
          

	Scenario Outline: Cancel Editing Drop Point
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And User click icon edit to editing Drop Point
    Then User click Batal to cancel editing Drop Point
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Cancel Deleting Drop Point
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And User click icon delete to deleting Drop Point
    Then User click button Batal to close the Delete Pop Up Drop Point
    
    Examples: 
      | emailK1        				| passwordK1 	|
      | superadmin@gmail.com	| 123456			|
      
	Scenario Outline: Search for a Drop Point with Valid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And Users input appropriate keywords on Search Field K3
    Then Verify that the data displayed matches the keywords searched K3
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Search for a Drop Point with Invalid Keyword
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And Users entered invalid keywords on Search Field K3
    Then Verify that no data with the invalid keyword can be found K3
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |
      
  Scenario Outline: Navigating Through Drop Point Pages
    When User fill <emailK1> and <passwordK1> on K1 field
    And User click Login Button and get directed to Dashboard K1
    And User click Konten dan Informasi and Drop Point
    And Users click the arrow icon to navigate or change pages K3
    Then Verify that the data displayed changes according to the page K3
    
    Examples: 
      | emailK1                   | passwordK1 |
      | superadmin@gmail.com      | 123456     |