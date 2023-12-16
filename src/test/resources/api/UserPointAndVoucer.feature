Feature: Point and Voucher
  As an User
  I want to See Point and Voucher
  So that I can See Point and Voucher

  Scenario: Get - As User I Can View All Voucher
    Given I set Get Voucher Endpoint With Correct Data
    When I send Get Voucher request
    Then I receive Get Voucher valid HTTP response code 200

  Scenario: Post - As User I Can't See Voucher Endpoint with Wrong Request
    Given I set POST Voucher Endpoint with Wrong HTTP Request
    When I send POST Voucher HTTP request2
    Then I receive POST Voucher valid HTTP response code 405

  Scenario: Get - As User I Can't See Voucher Endpoint with Wrong URL
    Given I set Get Voucher Endpoint With Wrong URL
    When I send Get Voucher HTTP request3
    Then I receive Get Voucher valid HTTP response code 404

  Scenario: Get - As User I Can See Voucher By ID
    Given I set Get Voucher By ID Endpoint With Correct Data
    When I send Get Voucher By ID request
    Then I receive Get Voucher By ID valid HTTP response code 200

  Scenario: Post - As User I Can't See Voucher By ID Endpoint with Wrong Request
    Given I set POST Voucher By ID Endpoint with Wrong HTTP Request
    When I send POST Voucher By ID HTTP request2
    Then I receive POST Voucher By ID valid HTTP response code 405

  Scenario: Get - As User I Can't See Voucher By ID Endpoint with Wrong URL
    Given I set Get Voucher By ID Endpoint With Wrong URL
    When I send Get Voucher By ID HTTP request3
    Then I receive Get Voucher By ID valid HTTP response code 404

  Scenario: Post - As User I Can Claim Daily Point
    Given I set Post Claim Daily Point Endpoint With Correct Data
    When I send Post Claim Daily Point request
    Then I receive Post Claim Daily Point valid HTTP response code 201

  Scenario: Get - As User I Can't See Claim Daily Point Endpoint with Wrong Request
    Given I set Get Claim Daily Point Endpoint with Wrong HTTP Request
    When I send Get Claim Daily Point HTTP request2
    Then I receive Get Claim Daily Point valid HTTP response code 403

  Scenario: Post - As User I Can't See Claim Daily Point Endpoint with Wrong Body
    Given I set Get Claim Daily Point Endpoint With Wrong Body
    When I send Get Claim Daily Point HTTP request3
    Then I receive Get Claim Daily Point valid HTTP response code 400

  Scenario: Post - As User I Can Exchange Point with Voucher
    Given I set Post Exchange Point with Voucher Endpoint With Correct Data
    When I send Post Exchange Point with Voucher request
    Then I receive Post Exchange Point with Voucher valid HTTP response code 201

  Scenario: Put - As User I Can't See Claim Daily Point Endpoint with Wrong Request
    Given I set Put Exchange Point with Voucher Endpoint with Wrong HTTP Request
    When I send Put Exchange Point with Voucher HTTP request2
    Then I receive Put Exchange Point with Voucher valid HTTP response code 404

  Scenario: Post - As User I Can't See Claim Daily Point Endpoint with Wrong Body
    Given I set Post Exchange Point with Voucher Endpoint With Wrong Body
    When I send Post Exchange Point with Voucher HTTP request3
    Then I receive Post Exchange Point with Voucher valid HTTP response code 400

  Scenario: Get - As User I Can See Claimed Point
    Given I set Get Claimed Point Endpoint With Correct Data
    When I send Get Claimed Point request
    Then I receive Get Claimed Point valid HTTP response code 200

  Scenario: Post - As User I Can't See Claimed Point Endpoint with Wrong Request
    Given I set POST Claimed Point Endpoint with Wrong HTTP Request
    When I send POST Claimed Point HTTP request2
    Then I receive POST Claimed Point valid HTTP response code 405

  Scenario: Get - As User I Can't See Claimed Point Endpoint with Wrong URL
    Given I set Get Claimed Point Endpoint With Wrong URL
    When I send Get Claimed Point HTTP request3
    Then I receive Get Claimed Point valid HTTP response code 404

  Scenario: Get - As User I Can See All History
    Given I set Get All History Endpoint With Correct Data
    When I send Get All History request
    Then I receive Get All History valid HTTP response code 200

  Scenario: Post - As User I Can't See All History Endpoint with Wrong Request
    Given I set POST All History Endpoint with Wrong HTTP Request
    When I send POST All History HTTP request2
    Then I receive POST All History valid HTTP response code 405

  Scenario: Get - As User I Can't See All History Endpoint with Wrong URL
    Given I set Get All History Endpoint With Wrong URL
    When I send Get All History HTTP request3
    Then I receive Get All History valid HTTP response code 404

  Scenario: Get - As User I Can See All History By ID
    Given I set Get All History By ID Endpoint With Correct Data
    When I send Get All History By ID request
    Then I receive Get All History By ID valid HTTP response code 200

  Scenario: Post - As User I Can't See All History Endpoint with Wrong Request
    Given I set POST All History By ID Endpoint with Wrong HTTP Request
    When I send POST All History By ID HTTP request2
    Then I receive POST All History By ID valid HTTP response code 405

  Scenario: Get - As User I Can't See All History Endpoint with Wrong URL
    Given I set Get All History By ID Endpoint With Wrong URL
    When I send Get All History By ID HTTP request3
    Then I receive Get All History By ID valid HTTP response code 404