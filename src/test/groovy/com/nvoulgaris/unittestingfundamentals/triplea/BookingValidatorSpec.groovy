package com.nvoulgaris.unittestingfundamentals.triplea

import spock.lang.Specification

class BookingValidatorSpec extends Specification {

  BookingValidator bookingValidator

  def setup() {
    bookingValidator = new BookingValidator()
  }

  def "should throw an exception when validating a booking without a booking ID"() {
    given:
      Booking bookingWithoutId = new Booking(null)
    when:
      bookingValidator.validate(bookingWithoutId)
    then:
      thrown(InvalidBookingException)
  }

  def "should not throw an exception when validating a valid booking"() {
    given:
      Booking validBooking = new Booking("WXZ7184")
    when:
      bookingValidator.validate(validBooking)
    then:
      noExceptionThrown()
  }
}
