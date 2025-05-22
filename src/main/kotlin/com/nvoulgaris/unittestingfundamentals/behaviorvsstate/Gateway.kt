package com.nvoulgaris.unittestingfundamentals.behaviorvsstate

/**
 * This is a dummy implementation, in order to support
 * [com.nvoulgaris.unittestingfundamentals.readability.GatewaySpec]
 */
class Gateway {

  private var retries = 0

  fun get(request: Request) {
    var result: Boolean = request.execute()

    while (!result && retries < 1) {
      result = request.execute()
      retries++
    }
  }
}
