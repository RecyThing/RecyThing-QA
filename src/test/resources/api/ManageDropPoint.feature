Feature: Manage Drop Point
  As an Super Admin
  I want to manage Drop Point
  So that I can see and delete Drop Point

  Scenario: GET - As an Super Admin, I can view All Drop Point with Valid Request
    Given I set GET method to view All Drop Point with valid request
    When I send GET for All Drop Point endpoint requests to connect to APIs MDP1
    Then I receive HTTP response code 200 for view All Drop Point

  Scenario: POST - As an Super Admin, I can not view All Drop Point with Invalid Request Method
    Given I set POST method to view All Drop Point with invalid request method
    When I send POST for All Drop Point endpoint requests to connect to APIs MDP1
    Then I receive HTTP response code 400 for view All Drop Point

  Scenario: GET - As an Super Admin, I can view detail Drop Point with Valid Request
    Given I set GET method to view detail Drop Point with valid request
    When I send GET for detail Drop Point endpoint requests to connect to APIs MDP2
    Then I receive HTTP response code 200 for view detail Drop Point

  Scenario: POST - As an Super Admin, I can not view detail Drop Point with Invalid Request Method
    Given I set POST method to view detail Drop Point with invalid request method
    When I send POST for detail Drop Point endpoint requests to connect to APIs MDP2
    Then I receive HTTP response code 400 for view detail Drop Point

  Scenario: DEL - As an Super Admin, I can delete Drop Point By ID with Valid Request
    Given I set DEL method to delete Drop Point with valid request
    When I send DEL for detail Drop Point endpoint requests to connect to APIs MDP3
    Then I receive HTTP response code 200 for delete Drop Point