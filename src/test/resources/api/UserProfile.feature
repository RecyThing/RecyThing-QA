Feature: View User Profile
As an User
I want to See Profile
So that I can See my Profile and others Feature


Scenario: Get - As User I Can View User Profile
Given I set Get View User Profile Endpoint With Correct Data
When I send Get View User Profile request
Then I receive Get View User Profile valid HTTP response code 200

Scenario: Post - As User I Can View User Profile Endpoint with Wrong Request
Given I set POST View User Profile Endpoint with Wrong HTTP Request
When I send POST View User Profile HTTP request2
Then I receive POST View User Profile valid HTTP response code 405

Scenario: Get - As User I Can View User Profile Endpoint with Wrong URL
Given I set Get View User Profile Endpoint With Wrong URL
When I send Get View User Profile HTTP request3
Then I receive Get View User Profile valid HTTP response code 404

  Scenario: Patch - As User I Reset Password On Profile
    Given I set Patch Reset Password On Profile Endpoint With Correct Data
    When I send Patch Reset Password On Profile request
    Then I receive Patch Reset Password On Profile response code 200

  Scenario: Post - As User I Can add new data Register Endpoint with Wrong Request
    Given I set POST Reset Password On Profile Endpoint with Wrong HTTP Request
    When I send POST Reset Password On Profile HTTP request2
    Then I receive POST Reset Password On Profile valid HTTP response code 405

  Scenario: Patch - As User I Can add new data Register Endpoint with Wrong URL
    Given I set Patch Reset Password On Profile Endpoint With Wrong URL
    When I send Patch Reset Password On Profile HTTP request3
    Then I receive Patch Reset Password On Profile valid HTTP response code 404

