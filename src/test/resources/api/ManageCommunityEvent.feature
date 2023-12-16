Feature: Manage Community Event
  As an Super Admin
  I want to manage Community Event
  So that I can see and delete Community Event

  Scenario: GET - As an Super Admin, I can view All Community Event with Valid Request
    Given I set GET method to view All Community Event with valid request
    When I send GET for All Community Event endpoint requests to connect to APIs CE1
    Then I receive HTTP response code 200 for view All Community Event

  Scenario: POST - As an Super Admin, I can not view All Community Event with Invalid Request Method
    Given I set POST method to view All Community Event with invalid request method
    When I send POST for All Community Event endpoint requests to connect to APIs CE1
    Then I receive HTTP response code 400 for view All Community Event

  Scenario: GET - As an Super Admin, I can view detail Community Event with Valid Request
    Given I set GET method to view detail Community Event with valid request
    When I send GET for detail Community Event endpoint requests to connect to APIs CE2
    Then I receive HTTP response code 200 for view detail Community Event

  Scenario: POST - As an Super Admin, I can not view detail Community Event with Invalid Request Method
    Given I set POST method to view detail Community Event with invalid request method
    When I send POST for detail Community Event endpoint requests to connect to APIs CE2
    Then I receive HTTP response code 400 for view detail Community Event
