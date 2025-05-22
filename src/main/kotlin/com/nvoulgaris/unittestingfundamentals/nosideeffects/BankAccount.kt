package com.nvoulgaris.unittestingfundamentals.nosideeffects

class BankAccount {

  private var balance: Int = 0

  fun deposit(amount: Int) {
    balance += amount
  }
}