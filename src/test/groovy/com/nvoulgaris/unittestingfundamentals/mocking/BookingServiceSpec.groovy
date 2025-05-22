package com.nvoulgaris.unittestingfundamentals.mocking

import spock.lang.Specification

class BookingServiceSpec extends Specification {

  Gateway gateway
  BookingService service

  def setup() {
    gateway = Mock()
    service = new BookingService(gateway)
  }

  def "should not create a booking when the amount is negative"() {
    when:
      service.create(-100)
    then:
      0 * gateway.send()
  }

  def "should create a booking when the amount is non-negative"() {
    given:
      gateway.send() >> true
    when:
      service.create(200)
    then:
      1 * gateway.send()
  }
}
