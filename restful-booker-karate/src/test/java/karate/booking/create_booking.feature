Feature: Creates a new booking in the API
  As a restful-booker API user
  I want to create a new booking
  To test functionality

  Background:
    * url api.baseUrl

  @SuccessfullyCreateBooking
  Scenario: Create correctly a new booking in the API
    * def body = read('request_body_create_booking_correct.json')
    * request body
    * header Accept = 'application/json'
    Given path '/booking'
    When method Post
    Then status 200
    And match $.booking.firstname == '#string'
    And match $.booking.lastname == '#string'
    And match $.booking.totalprice == '#number'
    And match $.booking.depositpaid == '#boolean'
    And match $.booking.bookingdates == '#object'
    And match $.booking.additionalneeds == '#string'

  @CreateUnsuccessfulBooking
  Scenario: Create a booking with invalid data
    * def body = read('request_body_create_booking_incorrect.json')
    * request body
    * header Accept = 'application/json'
    Given path '/booking'
    When method Post
    Then status 200
    And match response == 'Invalid date'

