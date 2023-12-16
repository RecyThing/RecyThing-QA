Feature: Article
  As an User
  I want to See Article
  So that I can See Article

  Scenario: Get - As User I Can See Article With Correct Data
    Given I set Get Article Endpoint With Correct Data
    When I send Get Article request
    Then I receive Get Article valid HTTP response code 200

  Scenario: Post - As User I Can't See Article Endpoint with Wrong Request
    Given I set POST Article Endpoint with Wrong HTTP Request
    When I send POST Article HTTP request2
    Then I receive POST Article valid HTTP response code 404

  Scenario: Get - As User I Can See Article Endpoint with Wrong URL
    Given I set Get Article Endpoint With Wrong URL
    When I send Get Article HTTP request3
    Then I receive Get Article valid HTTP response code 404

  Scenario: Get - As User I Can See Article By ID With Correct Data
    Given I set Get Article By ID Endpoint With Correct Data
    When I send Get Article By ID request
    Then I receive Get Article By ID valid HTTP response code 200

  Scenario: Post - As User I Can't See Article By ID Endpoint with Wrong Request
    Given I set POST Article By ID Endpoint with Wrong HTTP Request
    When I send POST Article By ID HTTP request2
    Then I receive POST Article By ID valid HTTP response code 405

  Scenario: Get - As User I Can See Article By ID Endpoint with Wrong URL
    Given I set Get Article By ID Endpoint With Wrong URL
    When I send Get Article By ID HTTP request3
    Then I receive Get Article By ID valid HTTP response code 404

  Scenario: Get - As User I Can See All Trash Category With Correct Data
    Given I set All Trash Category Endpoint With Correct Data
    When I send Get All Trash Category request
    Then I receive Get All Trash Category valid HTTP response code 200

  Scenario: Post - As User I Can't See All Trash Category with Wrong Request
    Given I set POST All Trash Category Endpoint with Wrong HTTP Request
    When I send POST All Trash Category HTTP request2
    Then I receive POST All Trash Category valid HTTP response code 405

  Scenario: Get - As User I Can See All Trash Category Endpoint with Wrong URL
    Given I set Get All Trash Category Endpoint With Wrong URL
    When I send Get All Trash Category HTTP request3
    Then I receive Get All Trash Category valid HTTP response code 404

  Scenario: Get - As User I Can See Detail Trash Category With Correct Data
    Given I set Detail Trash Category Endpoint With Correct Data
    When I send Get Detail Trash Category request
    Then I receive Get Detail Trash Category valid HTTP response code 200

  Scenario: Post - As User I Can't See Detail Trash Category with Wrong Request
    Given I set POST Detail Trash Category Endpoint with Wrong HTTP Request
    When I send POST Detail Trash Category HTTP request2
    Then I receive POST Detail Trash Category valid HTTP response code 405

  Scenario: Get - As User I Can See Detail Trash Category Endpoint with Wrong URL
    Given I set Get Detail Trash Category Endpoint With Wrong URL
    When I send Get Detail Trash Category HTTP request3
    Then I receive Get Detail Trash Category valid HTTP response code 404

  Scenario: Get - As User I Can See Popular Article With Correct Data
    Given I set  Popular Article Endpoint With Correct Data
    When I send Get  Popular Article request
    Then I receive Get  Popular Article valid HTTP response code 200

  Scenario: Post - As User I Can't See Popular Article with Wrong Request
    Given I set POST Popular Article Endpoint with Wrong HTTP Request
    When I send POST Popular Article HTTP request2
    Then I receive POST Popular Article valid HTTP response code 405

  Scenario: Get - As User I Can See Popular Article Endpoint with Wrong URL
    Given I set Get Popular Article Endpoint With Wrong URL
    When I send Get Popular Article HTTP request3
    Then I receive Get Popular Article valid HTTP response code 404

  Scenario: POST - As User I Can Like Article With Correct Data
    Given I set  Like Article Endpoint With Correct Data
    When I send Get  Like Article request
    Then I receive Get  Like Article valid HTTP response code 200

  Scenario: Get - As User I Can't Like Article with Wrong Request
    Given I set POST Like Article Endpoint with Wrong HTTP Request
    When I send POST Like Article HTTP request2
    Then I receive POST Like Article valid HTTP response code 404

  Scenario: POST - As User I Can Like Article Endpoint with Wrong URL
    Given I set Get Like Article Endpoint With Wrong URL
    When I send Get Like Article HTTP request3
    Then I receive Get Like Article valid HTTP response code 400

