package com.example.junitdsl

import org.junit.Before
import org.junit.Test

class UnitTestCollections {

  lateinit var list: List<String>

  @Before
  fun test_setup() {
    list = listOf("item1", "item2", "car", "dog")
  }

  @Test
  fun test_shouldContainAtLeastOneItemMatching() {
    //make sure
    list shouldContainAtLeasOneItemMatching { it.contains("item") }
  }

  @Test(expected = AssertionError::class)
  fun test_shouldContainAtLeastOneItemMatching2() {
    //make sure
    list shouldContainAtLeasOneItemMatching { it.contains("boom") }
  }

  @Test
  fun test_shouldNotContainAnyItemMatching() {
    //when
    list shouldNotContainAnyItemMatching { it.contains("shapoor") }
  }

  @Test(expected = AssertionError::class)
  fun test_shouldNotContainAnyItemMatching2() {
    //when
    list shouldNotContainAnyItemMatching { it.contains("item") }
  }

  @Test
  fun test_shouldBeEmpty() {
    listOf<Any>() shouldBe EMPTY
  }
}