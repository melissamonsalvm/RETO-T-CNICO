Feature: Creates a new booking in the API
  As a restful-booker API user
  I want to create a new booking
  To test functionality

  Background:
    * url api.baseUrl

  @SuccessfullyCreateBooking
  Scenario: Create correctly a new booking in the API
    * def body = read('classpath:booking/request_body_create_booking.json')
    * request body
    Given path '/booking'
    When method Post
    Then status 200
    And match $.firstname == '#string'
    And match $.lastname == '#string'
    And match $.totalprice == '#number'
    And match $.depositpaid == '#boolean'
    And match $.bookingdates == '#array'
    And match $.additionalneeds == '#string'

