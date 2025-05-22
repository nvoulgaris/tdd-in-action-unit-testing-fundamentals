package com.nvoulgaris.unittestingfundamentals.triplea

class BookingValidator {

  fun validate(booking: Booking) {
    if (booking.bookingId == null) throw InvalidBookingException()
  }
}
