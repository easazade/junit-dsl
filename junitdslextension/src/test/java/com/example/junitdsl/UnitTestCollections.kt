package com.example.junitdsl

import org.junit.Before
import org.junit.Test

class UnitTestCollections {

    lateinit var list: List<String>

    @Before
    fun setup() {
        list = listOf("item1", "item2", "car", "dog")
    }

    @Test
    fun shouldContainAtLeastOneItemMatching() {
        //make sure
        list shouldContainAtLeasOneItemMatching { it.contains("item") }
    }

    @Test(expected = AssertionError::class)
    fun shouldContainAtLeastOneItemMatching2() {
        //make sure
        list shouldContainAtLeasOneItemMatching { it.contains("boom") }
    }

    @Test
    fun shouldNotContainAnyItemMatching() {
        //when
        list shouldNotContainAnyItemMatching { it.contains("shapoor") }
    }

    @Test(expected = AssertionError::class)
    fun shouldNotContainAnyItemMatching2() {
        //when
        list shouldNotContainAnyItemMatching { it.contains("item") }
    }

}