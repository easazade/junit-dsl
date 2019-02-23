package com.example.junitdsl

import org.junit.Assert.assertEquals
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
    fun shouldContainAtLeastOneItemMatching() {
        //with
        val list = listOf("item1", "item2", "car", "dog")
        //make sure
        list shouldContainAtLeasOneItemMatching { it.contains("item") }
    }

    @Test(expected = AssertionError::class)
    fun shouldContainAtLeastOneItemMatching2() {
        //with
        val list = listOf("item1", "item2", "car", "dog")
        //make sure
        list shouldContainAtLeasOneItemMatching { it.contains("boom") }
    }

    @Test
    fun should() {
        val address = "C:\\Android.SDK"
        val result = System.getenv("ANDROID_HOME")
        assertEquals(result, address)
    }

}