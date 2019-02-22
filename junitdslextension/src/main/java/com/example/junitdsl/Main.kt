package com.example.junitdsl

import org.junit.Assert

internal class Main {

    fun main(args: Array<String>) {

//#######################################################
//        read this source code build config to unserstand how to upload java library to maven or jcenter
//                    https@ //github.com/razeghi71/JalaliCalendar



        println("Hello, World!")
        5 shouldEqualTo 10 - 5
        val name = "alireza"
        val name2 = name
        name shouldBeSameAs name2
//        assert name equalTo name2
        true shouldEqualTo true
        val list = listOf(9, 8, 5, 7)
        list shouldNotContainAnyItemMatching { it == 12 }
//        assert list hasNoItemMatching {it == 12}
        list shouldContainAtLeasOneItemMatching { it / 2 == 4 }

        Assert.assertEquals(5, 10 - 5)
        5 shouldEqualTo 10 - 5


    }

}