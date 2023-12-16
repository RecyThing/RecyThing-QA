Feature: Manage Trash Exchange
  As an Super Admin
  I want to manage Trash Exchange
  So that I can see and delete Trash Exchange

  Scenario: GET - As an Super Admin, I can view All Trash Exchange with Valid Request
    Given I set GET method to view All Trash Exchange with valid request
    When I send GET for All Trash Exchange endpoint requests to connect to APIs MTE1
    Then I receive HTTP response code 200 for view All Trash Exchange

  Scenario: POST - As an Super Admin, I can not view All Trash Exchange with Invalid Request Method
    Given I set POST method to view All Trash Exchange with invalid request method
    When I send POST for All Trash Exchange endpoint requests to connect to APIs MTE1
    Then I receive HTTP response code 404 for view All Trash Exchange

  Scenario: GET - As an Super Admin, I can view detail Trash Exchange with Valid Request
    Given I set GET method to view detail Trash Exchange with valid request
    When I send GET for detail Trash Exchange endpoint requests to connect to APIs MTE2
    Then I receive HTTP response code 200 for view detail Trash Exchange

  Scenario: POST - As an Super Admin, I can not view detail Trash Exchange with Invalid Request Method
    Given I set POST method to view detail Trash Exchange with invalid request method
    When I send POST for detail Trash Exchange endpoint requests to connect to APIs MTE2
    Then I receive HTTP response code 400 for view detail Trash Exchange

  Scenario: DEL - As an Super Admin, I can delete Trash Exchange By ID with Valid Request
    Given I set DEL method to delete Trash Exchange with valid request
    When I send DEL for detail Trash Exchange endpoint requests to connect to APIs MTE3
    Then I receive HTTP response code 200 for delete Trash Exchange