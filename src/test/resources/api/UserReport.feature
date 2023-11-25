Feature: User Reporting
  As an User
  I want to Report Rubbish, And Report Littering
  So that I can Report Rubbish, Littering Individual, Littering Company

  Scenario: Get - As User I Want to View User History
    Given I set Get View User History Endpoint With Correct Data
    When I send Get View User History request
    Then I receive Get View User History response code 200

  Scenario: Post - As User I Want to View User History Endpoint with Wrong Request
    Given I set POST View User History Endpoint with Wrong HTTP Request
    When I send POST View User History HTTP request2
    Then I receive POST View User History valid HTTP response code 404

  Scenario: Get - As User I Want to View User History Endpoint with Wrong URL
    Given I set Get View User History Endpoint With Wrong URL
    When I send Get View User History HTTP request3
    Then I receive Get View User History valid HTTP response code 404

  Scenario: Get - As User I Want to View User History By ID
    Given I set Get View User History By ID Endpoint With Correct Data
    When I send Get View User History By ID request
    Then I receive Get View User History By ID response code 200

  Scenario: Post - As User I Want to View User History By ID Endpoint with Wrong Request
    Given I set POST View User History Endpoint By ID with Wrong HTTP Request
    When I send POST View User History By ID HTTP request2
    Then I receive POST View User History By ID valid HTTP response code 404

  Scenario: Get - As User I Want to View User History By ID Endpoint with Wrong URL
    Given I set Get View User History By ID Endpoint With Wrong URL
    When I send Get View User History By ID HTTP request3
    Then I receive Get View User History By ID valid HTTP response code 404
