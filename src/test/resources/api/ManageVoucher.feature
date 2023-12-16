Feature: Manage Voucher
  As an Super Admin
  I want to manage Voucher
  So that I can see and delete Voucher

  Scenario: GET - As an Super Admin, I can view All Voucher with Valid Request
    Given I set GET method to view All Voucher with valid request
    When I send GET for All Voucher endpoint requests to connect to APIs MV1
    Then I receive HTTP response code 200 for view All Voucher

  Scenario: POST - As an Super Admin, I can not view All Voucher with Invalid Request Method
    Given I set POST method to view All Voucher with invalid request method
    When I send POST for All Voucher endpoint requests to connect to APIs MV1
    Then I receive HTTP response code 400 for view All Voucher

  Scenario: GET - As an Super Admin, I can view detail Voucher with Valid Request
    Given I set GET method to view detail Voucher with valid request
    When I send GET for detail Voucher endpoint requests to connect to APIs MV2
    Then I receive HTTP response code 200 for view detail Voucher

  Scenario: POST - As an Super Admin, I can not view detail Voucher with Invalid Request Method
    Given I set POST method to view detail Voucher with invalid request method
    When I send POST for detail Voucher endpoint requests to connect to APIs MV2
    Then I receive HTTP response code 400 for view detail Voucher

  Scenario: DEL - As an Super Admin, I can delete Voucher By ID with Valid Request
    Given I set DEL method to delete All Voucher with valid request
    When I send DEL for detail Voucher endpoint requests to connect to APIs MV3
    Then I receive HTTP response code 200 for delete Voucher