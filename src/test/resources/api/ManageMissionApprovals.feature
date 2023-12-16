Feature: Manage Mission Approvals
  As an Super Admin
  I want to manage Mission Approvals
  So that I can see all, detail, and Update Mission Approvals

  Scenario: GET - As an Super Admin, I can view All Mission Approvals with Valid Request
    Given I set GET method to view All Mission Approvals with valid request
    When I send GET for All Mission Approvals endpoint requests to connect to APIs MMA1
    Then I receive HTTP response code 200 for view All Mission Approvals

  Scenario: POST - As an Super Admin, I can not view All Mission Approvals with Invalid Request Method
    Given I set POST method to view All Mission Approvals with invalid request method
    When I send POST for All Mission Approvals endpoint requests to connect to APIs MMA1
    Then I receive HTTP response code 404 for view All Mission Approvals

  Scenario: GET - As an Super Admin, I can view Mission Approvals with Valid Request
    Given I set GET method to view Mission Approvals with valid request
    When I send GET for Mission Approvals endpoint requests to connect to APIs MMA2
    Then I receive HTTP response code 200 for view Mission Approvals

  Scenario: POST - As an Super Admin, I can not Mission Approvals with Invalid Request Method
    Given I set POST method to view Mission Approvals with invalid request method
    When I send POST for Mission Approvals endpoint requests to connect to APIs MMA2
    Then I receive HTTP response code 404 for view Mission Approvals

  Scenario: PUT - As an Super Admin, I can update Mission Approvals with Valid Request
    Given I set PUT method to update Mission Approvals with valid request
    When I send PUT for update Mission Approvals endpoint requests to connect to APIs MMA3
    Then I receive HTTP response code 200 for update Mission Approvals