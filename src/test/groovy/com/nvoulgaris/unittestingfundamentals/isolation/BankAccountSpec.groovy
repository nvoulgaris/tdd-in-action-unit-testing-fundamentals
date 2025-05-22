package com.nvoulgaris.unittestingfundamentals.isolation

import spock.lang.Specification

class BankAccountSpec extends Specification {

  /**
   * Defining account as static causes the tests to be dependent
   * on the execution order. This happens because they share the
   * account instance and therefore its state. This can be fixed
   * by creating a fresh account instance before every test case
   * (e.g. in a setup method or simply by removing the static
   * declaration).
   */
  static BankAccount account = new BankAccount()

  def "should increase balance after deposit"() {
    when:
      account.deposit(100)
    then:
      account.balance() == 100
  }

  def "should have zero balance by default"() {
    expect:
      account.balance() == 0
  }

  def "should decrease balance after withdrawal"() {
    given:
      account.deposit(200)
    when:
      account.withdraw(50)
    then:
      account.balance() == 150
  }
}
