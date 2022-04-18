Feature: Returns a specific booking based upon the booking id provided
  As a restful-booker API user
  I want to get a reservation by id
  To test the functionality

  Background:
    * url api.baseUrl

  @GetBookingByIdSuccessfully
  Scenario: Get booking by id successfully
    * def createBooking = call read('../features/create_booking.feature@SuccessfullyCreateBooking')
    * def idBooking = createBooking.response.bookingid
    * print idBooking
    * header Accept = 'application/json'
    Given path '/booking' , idBooking
    When method Get
    Then status 200
    And match $.firstname == 'Melissa'
    And match $.lastname == 'Monsalve'
    And match $.totalprice == 111
    And match $.depositpaid == true
    And match $.bookingdates.checkin == '2022-04-02'
    And match $.bookingdates.checkout == '2022-04-03'
    And match $.additionalneeds == 'all inclusive'

  @GetUnsuccessfulBookingById
  Scenario: Get a booking by id with incorrect data
    * header Accept = 'application/json'
    Given path '/booking' , 'asdfas'
    When method Get
    Then status 404
    And match response == 'Not Found'