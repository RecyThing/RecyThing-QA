Feature: Manage Prompt
  As an Super Admin
  I want to manage Prompt
  So that I can see and delete Prompt

  Scenario: GET - As an Super Admin, I can view All Prompt with Valid Request
    Given I set GET method to view All Prompt with valid request
    When I send GET for All Prompt endpoint requests to connect to APIs MP1
    Then I receive HTTP response code 200 for view All Prompt

  Scenario: POST - As an Super Admin, I can not view All Prompt with Invalid Request Method
    Given I set POST method to view All Prompt with invalid request method
    When I send POST for All Prompt endpoint requests to connect to APIs MP1
    Then I receive HTTP response code 404 for view All Prompt

  Scenario: GET - As an Super Admin, I can view detail Prompt with Valid Request
    Given I set GET method to view detail Prompt with valid request
    When I send GET for detail Prompt endpoint requests to connect to APIs MP2
    Then I receive HTTP response code 200 for view detail Prompt

  Scenario: POST - As an Super Admin, I can not view detail Prompt with Invalid Request Method
    Given I set POST method to view detail Prompt with invalid request method
    When I send POST for detail Prompt endpoint requests to connect to APIs MP2
    Then I receive HTTP response code 404 for view detail Prompt

  Scenario: DEL - As an Super Admin, I can delete Prompt By ID with Valid Request
    Given I set DEL method to delete All Prompt with valid request
    When I send DEL for detail Prompt endpoint requests to connect to APIs MP3
    Then I receive HTTP response code 200 for delete Prompt

  Scenario: POST - As an Super Admin, I can create Prompt with Valid Body Request
    Given I set POST method to create Prompt 1
    When I send POST for create Prompt with valid body and endpoint requests to connect to APIs MP4
    Then I receive HTTP response code 201 for create a Prompt 1

  Scenario: POST - As an Super Admin, I can create Prompt with Invalid Body Request
    Given I set POST method to create Prompt 2
    When I send POST for create a Prompt with invalid or blank body to connect to APIs MP4
    Then I receive HTTP response code 400 for create a Prompt 2

  Scenario: GET - As an Super Admin, I can not create Prompt with Invalid Request Method
    Given I set GET method to create Prompt with invalid request method
    When I send GET for create Prompt with valid body and endpoint requests to connect to APIs MP4
    Then I receive HTTP response code 400 for create a Prompt 3