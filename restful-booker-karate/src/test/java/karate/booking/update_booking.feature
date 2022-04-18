Feature: Updates a current booking
  As a restful-booker API user
  I want update a booking by id
  To test the functionality

  Background:
    * url api.baseUrl
    * def bookingToUpgrade = call read('../features/get_booking.feature@GetBookingByIdSuccessfully')
    * def idBookingToUpgrade = bookingToUpgrade.idBooking

  @UpdateBookingSuccessfully
  Scenario: Correctly update a booking by id
    * def authToken = call read('../features/create_token.feature@successfullyCreateAuthenticationToken')
    * header Accept = 'application/json'
    * header Cookie = 'token=' + authToken.response.token
    * def body = read('../jsonbase/request_body_update_booking_correct.json')
    * request body
    Given path '/booking' , idBookingToUpgrade
    When method Put
    Then status 200
    And match $.firstname == 'Jorge'
    And match $.lastname == 'Castaño'
    And match $.totalprice == 222
    And match $.depositpaid == false
    And match $.bookingdates.checkin == '2023-09-03'
    And match $.bookingdates.checkout == '2023-10-01'
    And match $.additionalneeds == 'breakfast'

  @UpdateUnsuccessfulBooking
  Scenario: Update a booking without authentication token
    * header Accept = 'application/json'
    * header Cookie = 'token=' + '2adsa42'
    * print idBookingToUpgrade
    Given path '/booking' , idBookingToUpgrade
    When method Put
    Then status 403
    And match response == 'Forbidden'