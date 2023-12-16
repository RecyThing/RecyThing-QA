Feature: Manage Mission
  As an Super Admin
  I want to manage Mission
  So that I can see and delete Mission

  Scenario: GET - As an Super Admin, I can view All Mission with Valid Request
    Given I set GET method to view All Mission with valid request
    When I send GET for All Mission endpoint requests to connect to APIs MM1
    Then I receive HTTP response code 200 for view All Mission

  Scenario: POST - As an Super Admin, I can not view All Mission with Invalid Request Method
    Given I set POST method to view All Mission with invalid request method
    When I send POST for All Mission endpoint requests to connect to APIs MM1
    Then I receive HTTP response code 400 for view All Mission

  Scenario: GET - As an Super Admin, I can view detail Mission with Valid Request
    Given I set GET method to view detail Mission with valid request
    When I send GET for detail Mission endpoint requests to connect to APIs MM2
    Then I receive HTTP response code 200 for view detail Mission

  Scenario: POST - As an Super Admin, I can not view detail Mission with Invalid Request Method
    Given I set POST method to view detail Mission with invalid request method
    When I send POST for detail Mission endpoint requests to connect to APIs MM2
    Then I receive HTTP response code 400 for view detail Mission

  Scenario: DEL - As an Super Admin, I can delete Mission By ID with Valid Request
    Given I set DEL method to delete Mission with valid request
    When I send DEL for detail Mission endpoint requests to connect to APIs MM3
    Then I receive HTTP response code 200 for delete Mission