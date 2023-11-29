Feature: Manage User
  As an Admin and Super Admin
  I want to manage user
  So that I can see and delete user

  Scenario: GET - As an Admin, I can view All Users with Valid Request
    Given I set GET method to view All Users with valid request
    When I send GET for All User endpoint requests to connect to APIs MU1
    Then I receive HTTP response code 200 for view All User

  Scenario: POST - As an Admin, I can not view All Users with Invalid Request Method
    Given I set POST method to view All Users with invalid request method
    When I send POST for All User endpoint requests to connect to APIs MU1
    Then I receive HTTP response code 404 for view All User

  Scenario: GET - As an Admin, I can view User By ID with Valid Request
    Given I set GET method to view All Users with valid request
    When I send GET for User By ID endpoint requests to connect to APIs MU2
    Then I receive HTTP response code 200 for view User By ID

  Scenario: POST - As an Admin, I can not view User By ID with Invalid Request Method
    Given I set POST method to view User By ID with invalid request method
    When I send POST for User By ID endpoint requests to connect to APIs MU2
    Then I receive HTTP response code 404 for view User By ID

  Scenario: DEL - As an Admin, I can delete User By ID with Valid Request
    Given I set DEL method to delete All Users with valid request
    When I send DEL for User By ID endpoint requests to connect to APIs MU3
    Then I receive HTTP response code 200 for delete User By ID
