package com.nvoulgaris.unittestingfundamentals.mocking

/**
 * This is a dummy implementation, in order to support
 * [com.nvoulgaris.unittestingfundamentals.readability.UsedIdsSpec]
 */
class UsedIds {

  private val usedIds: MutableSet<Id> = mutableSetOf()

  fun add(id: Id) {
    this.usedIds.add(id)
  }

  fun countIds(): Int =
    usedIds.size
}
