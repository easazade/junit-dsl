package com.example.junitdsl

import org.junit.Assert.*
import org.junit.Test

class UnitTests {

  @Test
  fun valueShouldBeTrue() {
    val flag = true
    flag shouldEqualTo true
  }

  @Test
  fun valueShouldBeFalse() {
    val flag = false
    flag shouldEqualTo false
  }

  @Test
  fun stringsShouldMatch() {
    val str1 = "apple is ..."
    val str2 = "apple is ..."
    str1 shouldEqualTo str2
  }

  @Test
  fun stringsShouldBeTheSame() {
    val car1 = Car("flying car")
    val car2 = car1
    car1 shouldBeSameAs car2
  }

  @Test
  fun paowmdpoawm() {
    assertTrue(4 == 6 - 2)
    4 shouldEqualTo 6 - 2
  }
}