package com.nvoulgaris.unittestingfundamentals.singleassertion

import spock.lang.Specification

class PasswordGeneratorSpec extends Specification {

  PasswordGenerator passwordGenerator

  def setup() {
    passwordGenerator = new PasswordGenerator()
  }

  def "should generate a password with 12 characters and at least one digit"() {
    when:
      String password = passwordGenerator.generate()
    then:
      password.length() == 12
      password.any { it.isNumber() }
  }
}
