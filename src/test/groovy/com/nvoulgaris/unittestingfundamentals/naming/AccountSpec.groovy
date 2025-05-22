package com.nvoulgaris.unittestingfundamentals.naming

import spock.lang.Specification

class AccountSpec extends Specification {

  def "should persist a deposit transaction when making a deposit"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "should throw an InvalidAmountException when making a deposit with a non-positive amount"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "should persist a withdrawal transaction when making a withdrawal"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "should throw an InvalidAmountException when making a withdrawal with a non-positive amount"() {
    // Actual test case is omitted for brevity
    expect: true
  }
}