Feature: Login
  As an Admin and SuperAdmin
  I want to authenticate Login API
  So that I can see and validate response of Login API

  Scenario: POST - As an Admin, I can login with Valid Request Login Admin
    Given I set POST method with valid endpoint and body requests Login Admin
    When I send Login requests to connect to APIs L1
    Then I receive HTTP response code 200 for Valid Login Admin

#  Scenario: POST - As an Admin, I can not login with Invalid Body Request Login Admin
#    Given I set POST method with valid endpoint and invalid body requests Login Admin
#    When I send Login requests to connect to APIs L2
#    Then I receive HTTP response code 400 for Invalid Login Admin
#
#  Scenario: GET - As an Admin, I can not login with Invalid Request Method Login Admin
#    Given I set GET method with valid endpoint and body requests Login Admin
#    When I send Login requests to connect to APIs L3
#    Then I receive HTTP response code 400 for Invalid Request Login Admin

  Scenario: POST - As an SuperAdmin, I can login with Valid Request Login SuperAdmin
    Given I set POST method with valid endpoint and body requests Login SuperAdmin
    When I send Login requests to connect to APIs L4
    Then I receive HTTP response code 200 for Valid Login SuperAdmin

#  Scenario: POST - As an SuperAdmin, I can not login with Invalid Body Request Login SuperAdmin
#    Given I set POST method with valid endpoint and invalid body requests Login SuperAdmin
#    When I send Login requests to connect to APIs L5
#    Then I receive HTTP response code 400 for Invalid Login SuperAdmin
#
#  Scenario: GET - As an SuperAdmin, I can not login with Invalid Request Method Login SuperAdmin
#    Given I set GET method with valid endpoint and body requests Login SuperAdmin
#    When I send Login requests to connect to APIs L6
#    Then I receive HTTP response code 400 for Invalid Request Login SuperAdmin