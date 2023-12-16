Feature: Manage Community
  As an Super Admin
  I want to manage Community
  So that I can see and delete Community

  Scenario: GET - As an Super Admin, I can view All Community with Valid Request
    Given I set GET method to view All Community with valid request
    When I send GET for All Community endpoint requests to connect to APIs C1
    Then I receive HTTP response code 200 for view All Community

  Scenario: POST - As an Super Admin, I can not view All Community with Invalid Request Method
    Given I set POST method to view All Community with invalid request method
    When I send POST for All Community endpoint requests to connect to APIs C1
    Then I receive HTTP response code 400 for view All Community

  Scenario: GET - As an Super Admin, I can view detail Community with Valid Request
    Given I set GET method to view detail Community with valid request
    When I send GET for detail Community endpoint requests to connect to APIs C2
    Then I receive HTTP response code 200 for view detail Community

  Scenario: POST - As an Super Admin, I can not view detail Community with Invalid Request Method
    Given I set POST method to view detail Community with invalid request method
    When I send POST for detail Community endpoint requests to connect to APIs C2
    Then I receive HTTP response code 400 for view detail Community

  Scenario: DEL - As an Super Admin, I can delete Community By ID with Valid Request
    Given I set DEL method to delete Community with valid request
    When I send DEL for detail Community endpoint requests to connect to APIs C3
    Then I receive HTTP response code 200 for delete Community