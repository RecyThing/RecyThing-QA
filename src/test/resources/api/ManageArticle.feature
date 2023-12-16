Feature: Manage Article
  As an Super Admin
  I want to manage Article
  So that I can see and delete Article

  Scenario: GET - As an Super Admin, I can view All Categories of Trash Type with Valid Request
    Given I set GET method to view All Categories of Trash Type with valid request
    When I send GET for All Categories of Trash Type endpoint requests to connect to APIs MA1
    Then I receive HTTP response code 200 for view All Categories of Trash Type

  Scenario: POST - As an Super Admin, I can not view All Categories of Trash Type with Invalid Request Method
    Given I set POST method to view All Categories of Trash Type with invalid request method
    When I send POST for All Categories of Trash Type endpoint requests to connect to APIs MA1
    Then I receive HTTP response code 404 for view All Categories of Trash Type

  Scenario: GET - As an Super Admin, I can view All Article with Valid Request
    Given I set GET method to view All Article with valid request
    When I send GET for All Article endpoint requests to connect to APIs MA2
    Then I receive HTTP response code 200 for view All Article

  Scenario: POST - As an Super Admin, I can not view All Article with Invalid Request Method
    Given I set POST method to view All Article with invalid request method
    When I send POST for All Article endpoint requests to connect to APIs MA2
    Then I receive HTTP response code 400 for view All Article

  Scenario: GET - As an Super Admin, I can view detail Article with Valid Request
    Given I set GET method to view detail Article with valid request
    When I send GET for detail Article endpoint requests to connect to APIs MA3
    Then I receive HTTP response code 200 for view detail Article

  Scenario: POST - As an Super Admin, I can not view detail Article with Invalid Request Method
    Given I set POST method to view detail Article with invalid request method
    When I send POST for detail Article endpoint requests to connect to APIs MA3
    Then I receive HTTP response code 400 for view detail Article

  Scenario: DEL - As an Super Admin, I can delete Article By ID with Valid Request
    Given I set DEL method to delete All Article with valid request
    When I send DEL for detail Article endpoint requests to connect to APIs MA4
    Then I receive HTTP response code 200 for delete Article