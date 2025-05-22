package com.nvoulgaris.unittestingfundamentals.behaviorvsstate

import spock.lang.Specification

class GatewaySpec extends Specification {

  Request requestThatFails
  Gateway gateway

  def setup() {
    requestThatFails = Mock()
    gateway = new Gateway()
  }

  def "should retry a failed request once"() {
    given:
      requestThatFails.execute() >> false
    when:
      gateway.get(requestThatFails)
    then:
      gateway.retries == 1
  }
}
