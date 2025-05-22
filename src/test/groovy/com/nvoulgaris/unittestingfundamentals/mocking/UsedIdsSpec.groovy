package com.nvoulgaris.unittestingfundamentals.mocking

import spock.lang.Specification

class UsedIdsSpec extends Specification {

  Id firstId = Mock()
  Id secondId = Mock()

  UsedIds usedIds

  def setup() {
    usedIds = new UsedIds()
  }

  def "should store the unique used Ids, without adding duplicates"() {
    given:
      usedIds.add(firstId)
      usedIds.add(firstId)
      usedIds.add(secondId)
    when:
      Integer countOfUsedIds = usedIds.countIds()
    then:
      countOfUsedIds == 2
  }
}
