Feature: User
  As an admin
  I want to get detail user
  So that I can update the user data

  Scenario: POST - As an user I want to authorized my account
    Given I set an endpoint for POST authorized account
    When I request POST authorized account
    Then I validate the authorized status code is 200
    And validate the data detail after authorized account

  Scenario: POST - As a user, I want to authorized account with invalid password
    Given I set an endpoint for POST authorized account
    When I request POST authorized account with invalid password
    Then I validate the authorized status code is 404
    And validate the data detail after failed authorized account

  Scenario: POST - As a user, I want to authorized account with null password
    Given I set an endpoint for POST authorized account
    When I request POST authorized account without password
    Then I validate the authorized status code is 400
    And validate the data detail after failed authorized account without password


  Scenario: POST - As an user I have to generate token
    Given I set an endpoint for POST generate token
    When I request POST generate token
    Then I validate the status code is 200
    And validate the data detail after generate token
    And get token for other request

  Scenario: POST - As an user I have to generate token with null password
    Given I set an endpoint for POST generate token
    When I request POST generate token with null password
    Then I validate the status code is 400
    And validate the data detail after failed generate token


  Scenario: POST - As an user I want to create new user
    Given I set an endpoint for POST new user
    When I request POST detail user
    Then I validate the status code is 201
    And validate the data detail after create user
    And get UserID for other request

  Scenario: POST NEGATIVE - As an user I can't create new user with invalid password
    Given I set an endpoint for POST new user
    When I request POST detail user with invalid password
    Then I validate the status code is 400
    And validate the data detail after failed create

  Scenario: POST NEGATIVE - As an user I can't create new user with the username and password that was already registered
    Given I set an endpoint for POST new user
    When I request POST detail user with the username and password that was already registered
    Then I validate the status code is 406
    And validate the data detail after failed create user with username and password that was already registered


  Scenario: DELETE - As an admin, I want to delete user
    Given I set an endpoint for the DELETE user
    When I request DELETE user using userId
    Then I validate the status code is 200
    And validate the data detail after DELETE user

  Scenario: DELETE - As an admin, I want to delete users with unauthorized
    Given I set an endpoint for the DELETE user
    When I request DELETE user using userId with unauthorized
    Then I validate the status code is 204
    And validate the data detail after DELETE user with unauthorized

  Scenario: DELETE - As an admin, I want to delete users with unauthorized and wrong userId
    Given I set an endpoint for the DELETE user
    When I request DELETE user using userId with unauthorized and wrong userId
    Then I validate the status code is 401
    And validate the data detail after DELETE user with unauthorized and wrong userId


  Scenario: GET NEGATIVE - As a user I have to be able to get detail user without authorized
    Given I set an endpoint for GET detail user
    When I request GET detail user
    Then I validate the status code is 401
    And validate the data detail

  Scenario: GET - As an admin, I have to be able to get detail user authorized token
    Given I set an endpoint for GET detail user
    When I request GET valid detail user
    Then I validate the status code is 200
    And validate the valid data detail