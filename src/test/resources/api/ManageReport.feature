Feature: Manage Report
  As an Super Admin
  I want to manage report
  So that I can see and update report

  Scenario: GET - As an Super Admin, I can view All Report with Valid Request
    Given I set GET method to view All Report with valid request
    When I send GET for All Report endpoint requests to connect to APIs MR1
    Then I receive HTTP response code 200 for view All Report

  Scenario: POST - As an Super Admin, I can not view All Report with Invalid Request Method
    Given I set POST method to view All Report with invalid request method
    When I send POST for All Report endpoint requests to connect to APIs MR1
    Then I receive HTTP response code 404 for view All Report

  Scenario: GET - As an Super Admin, I can view detail Report with Valid Request
    Given I set GET method to view detail Report with valid request
    When I send GET for detail Report endpoint requests to connect to APIs MR2
    Then I receive HTTP response code 200 for view detail Report

  Scenario: PATCH - As an Super Admin, I can not view detail Report with Invalid Request Method
    Given I set PATCH method to view detail Report with invalid request method
    When I send PATCH for detail Report endpoint requests to connect to APIs MR2
    Then I receive HTTP response code 404 for view detail Report

  Scenario: PATCH - As an Super Admin, I can Update Report By ID with Valid Request
    Given I set PATCH method to update Report By ID with valid request
    When I send PATCH for update Report endpoint and body requests to connect to APIs MR3
    Then I receive HTTP response code 200 for update Report

  Scenario: POST - As an Super Admin, I can not Update Report By ID with Invalid Request
    Given I set POST method to update Report By ID with valid request
    When I send POST for update Report endpoint and body requests to connect to APIs MR3
    Then I receive HTTP response code 404 for update Report