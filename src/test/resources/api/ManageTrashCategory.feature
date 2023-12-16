Feature: Manage Trash Category
  As an Super Admin
  I want to manage Trash Category
  So that I can create, view, update, and delete Trash Category

  Scenario: POST - As an Super Admin, I can create Trash Category with Valid Body Request
    Given I set POST method to create Trash Category 1
    When I send POST for create Trash Category with valid body and endpoint requests to connect to APIs MTC1
    Then I receive HTTP response code 201 for create a Trash Category

  Scenario: POST - As an Super Admin, I can create Trash Category with Invalid Body Request
    Given I set POST method to create Trash Category 2
    When I send POST for create a Trash Category with invalid or blank body to connect to APIs MTC1
    Then I receive HTTP response code 400 for create a Trash Category 2

  Scenario: GET - As an Super Admin, I can not create Trash Category with Invalid Request Method
    Given I set GET method to create Trash Category with invalid request method
    When I send GET for create Trash Category with valid body and endpoint requests to connect to APIs MTC1
    Then I receive HTTP response code 400 for create a Trash Category 3

#  Scenario: PUT - As an Super Admin, I can update Trash Category with Valid Body Request
#    Given I set PUT method to update Trash Category
#    When I send PUT for create Trash Category with valid body and endpoint requests to connect to APIs MTC2
#    Then I receive HTTP response code 200 for update a Trash Category
#
#  Scenario: GET - As an Super Admin, I can not update Trash Category with Invalid Request Method
#    Given I set GET method to update Trash Category with invalid request method
#    When I send GET for update Trash Category with valid body and endpoint requests to connect to APIs MTC2
#    Then I receive HTTP response code 400 for update a Trash Category

  Scenario: GET - As an Super Admin, I can view All Trash Category with Valid Request
    Given I set GET method to view All Trash Category with valid request
    When I send GET for Trash Category endpoint requests to connect to APIs MTC3
    Then I receive HTTP response code 200 for view All Trash Category

  Scenario: POST - As an Super Admin, I can not view All Trash Category with Invalid Request Method
    Given I set POST method to view All Trash Category with invalid request method
    When I send POST for All Trash Category endpoint requests to connect to APIs MTC3
    Then I receive HTTP response code 404 for view All Trash Category

  Scenario: GET - As an Super Admin, I can view detail Trash Category with Valid Request
    Given I set GET method to view detail Trash Category with valid request
    When I send GET for detail Trash Category endpoint requests to connect to APIs MTC4
    Then I receive HTTP response code 200 for view detail Trash Category

  Scenario: POST - As an Super Admin, I can not view detail Trash Category with Invalid Request Method
    Given I set POST method to view detail Trash Category with invalid request method
    When I send POST for detail Trash Category endpoint requests to connect to APIs MTC4
    Then I receive HTTP response code 400 for view detail Trash Category

  Scenario: DEL - As an Super Admin, I can delete Trash Category By ID with Valid Request
    Given I set DEL method to delete Trash Category with valid request
    When I send DEL for Trash Category endpoint requests to connect to APIs MTC5
    Then I receive HTTP response code 200 for delete a Trash Category