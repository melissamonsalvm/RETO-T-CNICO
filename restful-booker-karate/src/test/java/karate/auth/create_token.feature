Feature: Creates a new auth token to use for access to the PUT and DELETE /booking
  As a restful-booker API user
  I want to get a new authentication token
  To use for access to the PUT and DELETE of the booking

  Background:
    * url api.baseUrl
    * def username = credentials.username
    * def password = credentials.password

  @successfullyCreateAuthenticationToken
  Scenario: Successfully create a new authentication token
    * header Accept = 'application/json'
    * def body = read('../jsonbase/credentials.json')
    * request body
    Given path '/auth'
    When method Post
    Then status 200
    And match $.token == '#string'

  @CreateUnsuccessfulAuthenticationToken
  Scenario: Create an authentication token with incorrect data
    * header Accept = 'application/json'
    * def incorrectUsername = 'Admin123'
    Given path '/auth'
    And request {    "username" : "#(incorrectUsername)" , "password" : "#(password)"}
    When method Post
    Then status 200
    And match $.reason == 'Bad credentials'