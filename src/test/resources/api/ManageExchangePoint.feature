Feature: Manage Exchange Point
  As an Super Admin
  I want to manage Exchange Point
  So that I can see all, detail, and Update Exchange Point

  Scenario: GET - As an Super Admin, I can view All Exchange Point with Valid Request
    Given I set GET method to view All Exchange Point with valid request
    When I send GET for All Exchange Point endpoint requests to connect to APIs MEP1
    Then I receive HTTP response code 200 for view All Exchange Point

  Scenario: POST - As an Super Admin, I can not view All Exchange Point with Invalid Request Method
    Given I set POST method to view All Exchange Point with invalid request method
    When I send POST for All Exchange Point endpoint requests to connect to APIs MEP1
    Then I receive HTTP response code 404 for view All Exchange Point

  Scenario: GET - As an Super Admin, I can view Exchange Point with Valid Request
    Given I set GET method to view Exchange Point with valid request
    When I send GET for Exchange Point endpoint requests to connect to APIs MEP2
    Then I receive HTTP response code 200 for view Exchange Point

  Scenario: POST - As an Super Admin, I can not Exchange Point with Invalid Request Method
    Given I set POST method to view Exchange Point with invalid request method
    When I send POST for Exchange Point endpoint requests to connect to APIs MEP2
    Then I receive HTTP response code 404 for view Exchange Point

  Scenario: PATCH - As an Super Admin, I can update Point Exchange Point with Valid Request
    Given I set PATCH method to update Exchange Point with valid request
    When I send PATCH for update Exchange Point endpoint requests to connect to APIs MEP3
    Then I receive HTTP response code 200 for update Exchange Point