Feature: Mission
  As an User
  I want to See Mission
  So that I can See Mission on My App

Scenario: Post - As User I Can Claim Mission User With Correct Data
Given I set Post Claim Mission User Endpoint With Correct Data
When I send Post Claim Mission User request
Then I receive Post Claim Mission User valid HTTP response code 201

Scenario: Get - As User I Can't Claim Mission User Endpoint with Wrong Request
Given I set Get Claim Mission User Endpoint with Wrong HTTP Request
When I send Get Claim Mission User HTTP request2
Then I receive Get Claim Mission User valid HTTP response code 403

Scenario: Post - As User I Can't Claim Mission User Endpoint with Wrong URL
Given I set Post Claim Mission User Endpoint With Wrong Body
When I send Post Claim Mission User HTTP request3
Then I receive Post Claim Mission User valid HTTP response code 400

  Scenario: Get - As User I Can See Detail Mission With Correct Data
  Given I set Get See Detail Mission Endpoint With Correct Data
  When I send Get See Detail Mission request
  Then I receive Get See Detail Mission valid HTTP response code 200

  Scenario: Post - As User I Can't See Detail Mission Endpoint with Wrong Request
    Given I set Post See Detail Mission Endpoint with Wrong HTTP Request
    When I send Post See Detail Mission HTTP request2
    Then I receive Post See Detail Mission valid HTTP response code 404

  Scenario: Get - As User I Can't See Detail Mission Endpoint with Wrong URL
    Given I set Get See Detail Mission Endpoint With Wrong Body
    When I send Get See Detail Mission HTTP request3
    Then I receive Get See Detail Mission valid HTTP response code 404

  Scenario: Get - As User I Can See Mission With Correct Data
    Given I set Get See Mission Endpoint With Correct Data
    When I send Get See Mission request
    Then I receive Get See Mission valid HTTP response code 200

  Scenario: Post - As User I Can't See Mission Endpoint with Wrong Request
    Given I set Post See Mission Endpoint with Wrong HTTP Request
    When I send Post See Mission HTTP request2
    Then I receive Post See Mission valid HTTP response code 400

  Scenario: Get - As User I Can't See Mission Endpoint with Wrong URL
    Given I set Get See Mission Endpoint With Wrong Body
    When I send Get See Mission HTTP request3
    Then I receive Get See Mission valid HTTP response code 404

  Scenario: Get - As User I Can See History Mission With Correct Data
    Given I set Get See History Mission Endpoint With Correct Data
    When I send Get See History Mission request
    Then I receive Get See History Mission valid HTTP response code 200

  Scenario: Post - As User I Can't See History Mission Endpoint with Wrong Request
    Given I set Post See History Mission Endpoint with Wrong HTTP Request
    When I send Post See History Mission HTTP request2
    Then I receive Post See History Mission valid HTTP response code 400

  Scenario: Get - As User I Can't See Mission Endpoint with Wrong URL
    Given I set Get See History Mission Endpoint With Wrong Body
    When I send Get See History Mission HTTP request3
    Then I receive Get See History Mission valid HTTP response code 404