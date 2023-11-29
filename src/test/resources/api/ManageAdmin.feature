Feature: Manage Admin
  As an Super Admin
  I want to manage Admin
  So that I can see and delete Admin

  Scenario: GET - As an Super Admin, I can view All Admin with Valid Request
    Given I set GET method to view All Admin with valid request
    When I send GET for All Admin endpoint requests to connect to APIs MA1
    Then I receive HTTP response code 200 for view All Admin

  Scenario: POST - As an Super Admin, I can not view All Admin with Invalid Request Method
    Given I set POST method to view All Admin with invalid request method
    When I send POST for All Admin endpoint requests to connect to APIs MA1
    Then I receive HTTP response code 404 for view All Admin

  Scenario: GET - As an Super Admin, I can view detail Admin with Valid Request
    Given I set GET method to view detail Admin with valid request
    When I send GET for detail Admin endpoint requests to connect to APIs MA2
    Then I receive HTTP response code 200 for view detail Admin

  Scenario: POST - As an Super Admin, I can not view detail Admin with Invalid Request Method
    Given I set POST method to view detail Admin with invalid request method
    When I send POST for detail Admin endpoint requests to connect to APIs MA2
    Then I receive HTTP response code 404 for view detail Admin

  Scenario: DEL - As an Super Admin, I can delete Admin By ID with Valid Request
    Given I set DEL method to delete All Admin with valid request
    When I send DEL for detail Admin endpoint requests to connect to APIs MA3
    Then I receive HTTP response code 200 for delete Admin