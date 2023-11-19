Feature: Itro
  As an User
  I want to Authenticate API
  So that I can See the Result of intro API

  Scenario: Post - As admin I Can add new data Register Endpoint with Correct Data
    Given I set POST Register Endpoint
    When I send POST Register HTTP request
    Then I receive POST Register valid HTTP response code 200

  Scenario: Get - As admin I Can add new data Register Endpoint with Wrong HTTP Request
    Given I set Get Register Endpoint With Wrong HTTP Request
    When I send Get Register HTTP request2
    Then I receive Get Register valid HTTP response code 405

  Scenario: Post - As admin I Can add new data Register Endpoint with Wrong Body
    Given I set POST Register Endpoint with Wrong Body
    When I send POST Register HTTP request3
    Then I receive POST Register valid HTTP response code 400

  Scenario: Post - As admin I Can Login Endpoint with Correct Data
    Given I set POST Login Endpoint
    When I send POST Login HTTP request
    Then I receive POST Login valid HTTP response code 200

  Scenario: Get - As admin I Can Login Endpoint with Wrong HTTP Request
    Given I set Get Login Endpoint With Wrong HTTP Request
    When I send Get Login HTTP request2
    Then I receive Get Login valid HTTP response code 405

  Scenario: Post - As admin I Can Login Endpoint with Wrong Body
    Given I set POST Login Endpoint with Wrong Body
    When I send POST Login HTTP request3
    Then I receive POST Login valid HTTP response code 400


