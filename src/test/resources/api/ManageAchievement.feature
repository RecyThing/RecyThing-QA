Feature: Manage Achievement
  As an Super Admin
  I want to manage Achievement
  So that I can see and Update Achievement

  Scenario: GET - As an Super Admin, I can view Achievement with Valid Request
    Given I set GET method to view Achievement with valid request
    When I send GET for Achievement endpoint requests to connect to APIs MPA1
    Then I receive HTTP response code 200 for view Achievement

  Scenario: POST - As an Super Admin, I can not Achievement with Invalid Request Method
    Given I set POST method to view Achievement with invalid request method
    When I send POST for Achievement endpoint requests to connect to APIs MPA1
    Then I receive HTTP response code 404 for view Achievement

  Scenario: GET - As an Super Admin, I can update Point Achievement with Valid Request
    Given I set GET method to update Point Achievement with valid request
    When I send GET for update Point Achievement endpoint requests to connect to APIs MPA2
    Then I receive HTTP response code 200 for update Point Achievement