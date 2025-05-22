package com.nvoulgaris.unittestingfundamentals.mocking

/**
 * This is a dummy implementation, in order to support
 * [com.nvoulgaris.unittestingfundamentals.readability.BookingServiceSpec]
 */
class BookingService(
  private val gateway: Gateway
) {

  fun create(amount: Int) {
    if (amount < 0) return

    gateway.send()
  }
}
