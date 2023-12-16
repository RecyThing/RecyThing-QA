Feature: DropPoint
  As an User
  I want to See Drop Point
  So that I can See Drop Point

  Scenario: Get - As User I Can See Drop Point
    Given I set Get Drop Point Endpoint With Correct Data
    When I send Get Drop Point request
    Then I receive Get Drop Point valid HTTP response code 200

  Scenario: Post - As User I Can't See Drop Point Endpoint with Wrong Request
    Given I set POST Drop Point Endpoint with Wrong HTTP Request
    When I send POST Drop Point HTTP request2
    Then I receive POST Drop Point valid HTTP response code 405

  Scenario: Get - As User I Can't See Drop Point Endpoint with Wrong URL
    Given I set Get Drop Point Endpoint With Wrong URL
    When I send Get Drop Point HTTP request3
    Then I receive Get Drop Point valid HTTP response code 404

  Scenario: Get - As User I Can See Drop Point By ID
    Given I set Get Drop Point By ID Endpoint With Correct Data
    When I send Get Drop Point By ID request
    Then I receive Get Drop Point By ID valid HTTP response code 200

  Scenario: Post - As User I Can't See Drop Point By ID Endpoint with Wrong Request
    Given I set POST Drop Point By ID Endpoint with Wrong HTTP Request
    When I send POST Drop Point By ID HTTP request2
    Then I receive POST Drop Point By ID valid HTTP response code 405

  Scenario: Get - As User I Can't See Drop Point By ID Endpoint with Wrong URL
    Given I set Get Drop Point By ID Endpoint With Wrong URL
    When I send Get Drop Point By ID HTTP request3
    Then I receive Get Drop Point By ID valid HTTP response code 404