package com.example.junitdsl

import org.junit.Assert

infix fun <T : Any> T.shouldEqualTo(expected: T) {
  Assert.assertEquals(expected, this)
}

infix fun <T : Any> T.shouldBeSameAs(expected: T) {
  Assert.assertSame(expected, this)
}
