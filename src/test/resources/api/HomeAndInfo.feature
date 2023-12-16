Feature: Home And Info
  As an User
  I want to See Home and Information
  So that I can See Home and also Information

  Scenario: Get - As User I Can See FAQ Page
Given I set Get FAQ Endpoint With Correct Data
When I send Get FAQ request
Then I receive Get FAQ valid HTTP response code 200

Scenario: Post - As User I Can't See FAQ Endpoint with Wrong Request
Given I set POST FAQ Endpoint with Wrong HTTP Request
When I send POST FAQ HTTP request2
Then I receive POST FAQ valid HTTP response code 405

Scenario: Get - As User I Can View User Profile Endpoint with Wrong URL
Given I set Get FAQ Endpoint With Wrong URL
When I send Get FAQ HTTP request3
Then I receive Get FAQ valid HTTP response code 404

Scenario: Get - As User I Can see FAQ with ID
Given I set Get FAQ with ID Endpoint With Correct Data
When I send Get FAQ with ID request
Then I receive Get FAQ with ID valid HTTP response code 200

Scenario: Post - As User I Can FAQ with ID Endpoint with Wrong Request
Given I set POST FAQ with ID Endpoint with Wrong HTTP Request
When I send POST FAQ with ID HTTP request2
Then I receive POST FAQ with ID valid HTTP response code 405

Scenario: Get - As User I Can View User Profile Endpoint with Wrong URL
Given I set Get FAQ with ID Endpoint With Wrong URL
When I send Get FAQ with ID HTTP request3
Then I receive Get FAQ with ID valid HTTP response code 404

  Scenario: Post - As User I Can Ask RecyBot With Correct Data
    Given I set Post RecyBot Endpoint With Correct Data
    When I send Post RecyBot request
    Then I receive Post RecyBot valid HTTP response code 200

  Scenario: Get - As User I Can't Ask RecyBot Endpoint with Wrong Request
    Given I set Get RecyBot Endpoint with Wrong HTTP Request
    When I send Get RecyBot HTTP request2
    Then I receive Get RecyBot valid HTTP response code 405

  Scenario: Post - As User I Can't Ask RecyBot Endpoint with Wrong URL
    Given I set Post RecyBot Endpoint With Wrong URL
    When I send Post RecyBot HTTP request3
    Then I receive Post RecyBot valid HTTP response code 400

  Scenario: Get - As User I Can See Achievement
    Given I set Get Achievement Endpoint With Correct Data
    When I send Get Achievement request
    Then I receive Get Achievement valid HTTP response code 200

  Scenario: Post - As User I Can Achievement Endpoint with Wrong Request
    Given I set POST Achievement Endpoint with Wrong HTTP Request
    When I send POST Achievement HTTP request2
    Then I receive POST Achievement valid HTTP response code 405

  Scenario: Get - As User I Can Achievement Endpoint with Wrong URL
    Given I set Get Achievement Endpoint With Wrong URL
    When I send Get Achievement HTTP request3
    Then I receive Get Achievement valid HTTP response code 404