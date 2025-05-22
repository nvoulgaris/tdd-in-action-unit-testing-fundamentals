package com.nvoulgaris.unittestingfundamentals.singleassertion

import spock.lang.Specification

class CalculatorSpec extends Specification {

  Calculator calculator

  def setup() {
    calculator = new Calculator()
  }

  def "should divide two numbers and throw an ArithmeticException when dividing by zero"() {
    when:
      int result = calculator.divide(6, 2)
    then:
      result == 3
    when:
      calculator.divide(2, 0)
    then:
      thrown(ArithmeticException)
  }
}
