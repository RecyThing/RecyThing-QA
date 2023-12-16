Feature: Manage Dashboard
  As an Super Admin
  I want to manage Dashboard
  So that I can see Dashboard Monthly or Years

  Scenario: GET - As an Super Admin, I can view Monthly Dashboard with Valid Request
    Given I set GET method to view Monthly Dashboard with valid request
    When I send GET for Monthly Dashboard endpoint requests to connect to APIs MD1
    Then I receive HTTP response code 200 for view Monthly Dashboard

  Scenario: POST - As an Super Admin, I can not view Monthly Dashboard with Invalid Request Method
    Given I set POST method to view Monthly Dashboard with invalid request method
    When I send POST for Monthly Dashboard endpoint requests to connect to APIs MD1
    Then I receive HTTP response code 404 for view Monthly Dashboard

  Scenario: GET - As an Super Admin, I can view All Dashboard Years with Valid Request
    Given I set GET method to view All Dashboard Years with valid request
    When I send GET for All Dashboard Years endpoint requests to connect to APIs MD2
    Then I receive HTTP response code 200 for view All Dashboard Years

  Scenario: POST - As an Super Admin, I can not view All Dashboard Years with Invalid Request Method
    Given I set POST method to view All Dashboard Years with invalid request method
    When I send POST for All Dashboard Years endpoint requests to connect to APIs MD2
    Then I receive HTTP response code 404 for view All Dashboard Years