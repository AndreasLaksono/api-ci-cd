Feature: Books
  As an user
  I want to get detail books
  So that I can update the book data

  Scenario: GET - As a user I want to get book detail
    Given I set an endpoint for GET detail books
    When I request GET detail books
    Then I validate books status code is 200
    And validate the books detail

  Scenario: POST - As a user, I want to add book to my book collection
    Given I set an endpoint for POST new book isbn
    When I request POST detail isbn
    Then I validate the status code is 201
    And validate the data detail after adding isbn

  Scenario: POST NEGATIVE - As a user, I want to add book to my book collection without an authorization token
    Given I set an endpoint for POST new book isbn
    When I request POST detail isbn without authorization token
    Then I validate the status code is 401
    And validate the data detail after adding isbn without authorization token

  Scenario: POST NEGATIVE - As a user, I want to add book to my book collection without an authorization token and null isbn
    Given I set an endpoint for POST new book isbn
    When I request POST detail isbn without authorization token and null isbn
    Then I validate the status code is 400
    And validate the data detail after adding isbn without authorization token and null isbn


  Scenario: DELETE - As an admin, I want to delete the book
    Given I set an endpoint for the DELETE book
    When I request DELETE book using userId
    Then I validate the authorized status code is 204
    And validate the data detail after DELETE book

  Scenario: DELETE - As an admin, I want to delete book with unauthorized
    Given I set an endpoint for the DELETE book
    When I request DELETE books using userId with unauthorized
    Then I validate the authorized status code is 401
    And validate the data detail after DELETE book with unauthorized


  Scenario: GET - As a user, I want to get book detail
    Given I set an endpoint for GET detail book
    When I request GET detail book
    Then I validate the status code is 200
    And validate the book data detail

  Scenario: GET NEGATIVE - As a user, I want to get book detail with null isbn
    Given I set an endpoint for GET detail book
    When I request GET detail book with null isbn
    Then I validate the status code is 400
    And validate the book data detail with null isbn


  Scenario: DELETE - As a user, I want to delete book using isbn
    Given I set an endpoint for the DELETE book
    When I request DELETE book using isbn
    Then I validate the request, status code is 204
    And validate the data detail after DELETE book

  Scenario: DELETE - As a user, I want to delete a book with unauthorized
    Given I set an endpoint for the DELETE book
    When I request DELETE book using isbn with unauthorized
    Then I validate the request, status code is 401
    And validate the data detail after DELETE book with unauthorized

  Scenario: DELETE - As a user, I want to delete book with unauthorized and null isbn
    Given I set an endpoint for the DELETE book
    When I request DELETE book using isbn with unauthorized and null isbn
    Then I validate the request, status code is 401
    And validate the data detail after DELETE book with unauthorized and null isbn

  Scenario: PUT - As a user, I want to replace the book in my book collection using isbn
    Given I set an endpoint for PUT new book isbn
    When I request PUT detail book after replacing book data
    Then I validate the status code is 201
    And validate the data detail after replacing book data

  Scenario: PUT NEGATIVE - I want to replace the book in my book collection using null isbn
    Given I set an endpoint for PUT new book isbn
    When I request PUT detail book after replacing book data with null isbn
    Then I validate the status code is 400
    And validate the data detail after replacing book data with null isbn

  Scenario: PUT NEGATIVE - As a user, I want to replace the book in my book collection using isbn with unauthorized
    Given I set an endpoint for POST new book isbn
    When I request PUT detail book after replacing book data with unauthorized
    Then I validate the status code is 401
    And validate the data detail after replacing book data with unauthorized