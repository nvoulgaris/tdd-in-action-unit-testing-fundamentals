package com.nvoulgaris.unittestingfundamentals.isolation

import spock.lang.Specification

class TestExecutionOrderDemo extends Specification {

  def setupSpec() {
    println("Set up spec")
  }

  def setup() {
    println("Set up")
  }

  def "Test 1"() {
    println("Test 1")
    expect: true
  }

  def "Test 2"() {
    println("Test 2")
    expect: true
  }

  def "Test 3"() {
    println("Test 3")
    expect: true
  }

  def cleanup() {
    println("Clean up")
  }

  def cleanupSpec() {
    println("Clean up spec")
  }
}
