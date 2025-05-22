package com.nvoulgaris.unittestingfundamentals.isolation

/**
 * This is a dummy implementation, in order to support
 * [com.nvoulgaris.unittestingfundamentals.readability.BankAccountSpec]
 */
class BankAccount {

  private var balance: Int = 0

  fun deposit(amount: Int) {
    balance += amount
  }

  fun withdraw(amount: Int) {
    balance -= amount
  }

  fun balance(): Int {
    return balance
  }
}