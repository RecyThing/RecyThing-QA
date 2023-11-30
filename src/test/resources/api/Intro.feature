Feature: Intro
  As an User
  I want to Authenticate API
  So that I can See the Result of intro API

  Scenario: Post - As User I Can add new data Register Endpoint with Correct Data
    Given I set POST Register Endpoint
    When I send POST Register HTTP request
    Then I receive POST Register valid HTTP response code 200

  Scenario: Get - As User I Can add new data Register Endpoint with Wrong HTTP Request
    Given I set Get Register Endpoint With Wrong HTTP Request
    When I send Get Register HTTP request2
    Then I receive Get Register valid HTTP response code 405

  Scenario: Post - As User I Can add new data Register Endpoint with Wrong Body
    Given I set POST Register Endpoint with Wrong Body
    When I send POST Register HTTP request3
    Then I receive POST Register valid HTTP response code 400

  Scenario: Post - As User I Can Login Endpoint with Correct Data
    Given I set POST Login Endpoint
    When I send POST Login HTTP request
    Then I receive POST Login valid HTTP response code 200

  Scenario: Get - As User I Can Login Endpoint with Wrong HTTP Request
    Given I set Get Login Endpoint With Wrong HTTP Request
    When I send Get Login HTTP request2
    Then I receive Get Login valid HTTP response code 405

  Scenario: Post - As User I Can Login Endpoint with Wrong Body
    Given I set POST Login Endpoint with Wrong Body
    When I send POST Login HTTP request3
    Then I receive POST Login valid HTTP response code 400

  Scenario: Post - As User I Can Forgot Password Endpoint with Correct Data
    Given I set POST Reset Password Endpoint
    When I send POST Reset Password request
    Then I receive POST Reset Password HTTP response code 200

  Scenario: Get - As User I Can't Forgot Password with Wrong HTTP Request
    Given I set Get Reset Password with Wrong HTTP Request
    When I send Get Reset Password HTTP request2
    Then I receive Get Reset Password valid HTTP response code 405

  Scenario: Post - As User I Can Forgot Password with Wrong Body
    Given I set POST Reset Password with Wrong Body
    When I send POST Reset Password HTTP request3
    Then I receive POST Reset Password valid HTTP response code 400

#  Scenario: Patch - As User I Can Make new Password Endpoint with Correct Data
#    Given I set Patch Make New Password Endpoint
#    When I send Patch Make New Password request
#    Then I receive Patch Make New Password HTTP response code 200
#
#  Scenario: Post - As User I Can't Make new Password with Wrong HTTP Request
#    Given I set Post Make New Password with Wrong HTTP Request
#    When I send Post Make New Password HTTP request2
#    Then I receive Post Make New Password valid HTTP response code 405
#
#  Scenario: Patch - As User I Can Make New Password with Wrong Body
#    Given I set Patch Make New Password with Wrong Body
#    When I send Patch Make New Password HTTP request3
#    Then I receive Patch Make New Password valid HTTP response code 400


