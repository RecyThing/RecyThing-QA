Feature: Community
  As an User
  I want to See Community
  So that I can See Community

  Scenario: Get - As User I Can See All Community With Correct Data
    Given I set Get All Community Endpoint With Correct Data
    When I send Get All Community request
    Then I receive Get All Community valid HTTP response code 200

  Scenario: Post - As User I Can't See All Community Endpoint with Wrong Request
    Given I set POST All Community Endpoint with Wrong HTTP Request
    When I send POST All Community HTTP request2
    Then I receive POST All Community valid HTTP response code 404

  Scenario: Get - As User I Can't See All Community Endpoint with Wrong URL
    Given I set Get All Community Endpoint With Wrong URL
    When I send Get All Community HTTP request3
    Then I receive Get All Community valid HTTP response code 404

  Scenario: Get - As User I Can See Detail Community With Correct Data
    Given I set Get Detail Community Endpoint With Correct Data
    When I send Get Detail Community request
    Then I receive Get Detail Community valid HTTP response code 200

  Scenario: Put - As User I Can't See Detail Community Endpoint with Wrong Request
    Given I set Put Detail Community Endpoint with Wrong HTTP Request
    When I send Put Detail Community HTTP request2
    Then I receive Put Detail Community valid HTTP response code 404

  Scenario: Get - As User I Can't See Detail Community Endpoint with Wrong URL
    Given I set Get Detail Community Endpoint With Wrong URL
    When I send Get Detail Community HTTP request3
    Then I receive Get Detail Community valid HTTP response code 404

  Scenario: POST - As User I Can Join Community With Correct Data
    Given I set POST Join Community Endpoint With Correct Data
    When I send POST Join Community request
    Then I receive POST Join Community valid HTTP response code 200

  Scenario: Put - As User I Can't Join Community Endpoint with Wrong Request
    Given I set Put Join Community Endpoint with Wrong HTTP Request
    When I send Put Join Community HTTP request2
    Then I receive Put Join Community valid HTTP response code 404

  Scenario: POST - As User I Can't Join Community Endpoint with Wrong URL
    Given I set POST Join Community Endpoint With Wrong URL
    When I send POST Join Community HTTP request3
    Then I receive POST Join Community valid HTTP response code 404

  Scenario: Get - As User I Can See Event Community With Correct Data
    Given I set Get See Event Community Endpoint With Correct Data
    When I send Get See Event Community request
    Then I receive Get See Event Community valid HTTP response code 200

  Scenario: Post - As User I Can't See Event Community Endpoint with Wrong Request
    Given I set POST See Event Community Endpoint with Wrong HTTP Request
    When I send POST See Event Community HTTP request2
    Then I receive POST See Event Community valid HTTP response code 404

  Scenario: Get - As User I Can't See Event Community Endpoint with Wrong URL
    Given I set Get See Event Community Endpoint With Wrong URL
    When I send Get See Event Community HTTP request3
    Then I receive Get See Event Community valid HTTP response code 404

  Scenario: Get - As User I Can See Detail Event Community With Correct Data
    Given I set Get See Detail Event Community Endpoint With Correct Data
    When I send Get See Detail Event Community request
    Then I receive Get See Detail Event Community valid HTTP response code 200

  Scenario: Post - As User I Can't See Detail Event Community Endpoint with Wrong Request
    Given I set POST See Detail Event Community Endpoint with Wrong HTTP Request
    When I send POST See Detail Event Community HTTP request2
    Then I receive POST See Detail Event Community valid HTTP response code 404

  Scenario: Get - As User I Can't See Detail Event Community Endpoint with Wrong URL
    Given I set Get See Detail Event Community Endpoint With Wrong URL
    When I send Get See Detail Event Community HTTP request3
    Then I receive Get See Detail Event Community valid HTTP response code 404