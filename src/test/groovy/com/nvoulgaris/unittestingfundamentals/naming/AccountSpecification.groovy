package com.nvoulgaris.unittestingfundamentals.naming

import spock.lang.Specification

class AccountSpecification extends Specification {

  def "when making a deposit, then persist a deposit transaction"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "given a non-positive amount, when depositing it, then throw InvalidAmountException"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "when making a withdrawal, then persist a withdrawal transaction"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "given a non-positive amount, when withdrawing it, then throw InvalidAmountException"() {
    // Actual test case is omitted for brevity
    expect: true
  }
}