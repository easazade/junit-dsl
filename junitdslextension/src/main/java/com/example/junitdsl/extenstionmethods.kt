package com.example.junitdsl

import org.junit.Assert

infix fun <T : Any> T.shouldEqualTo(expected: T) {
    Assert.assertEquals(expected, this)
}

infix fun <T : Any> T.shouldBeSameAs(expected: T) {
    Assert.assertSame(expected, this)
}

infix fun <E : Any, T : Collection<E>> T.shouldContainAtLeasOneItemMatching(predicate: (E) -> Boolean) {
    Assert.assertNotNull(
        "expexted list to contain item matching given predicate" +
                "but there was not an object matching the predicate", firstMatch(this, predicate)
    )
}

infix fun <E : Any, T : Collection<E>> T.shouldNotContainAnyItemMatching(predicate: (E) -> Boolean) {
    Assert.assertNull(
        "expexted list not to contain item matching given predicate" +
                "but there was an object matching the predicate", firstMatch(this, predicate)
    )
}


internal fun <E> contains(
    list: MutableList<E>, item: E, matchingPredicate: (t1: E, t2: E) -> Boolean
): Boolean {
    var lisHasItem = false
    list.forEach { listItem ->
        if (matchingPredicate(listItem, item))
            lisHasItem = true
    }
    return lisHasItem
}

internal fun <E> firstMatch(
    list: Collection<E>,
    matchingPredicate: (listItem: E) -> Boolean
): E? {
    var match: E? = null
    list.forEach { listItem ->
        if (matchingPredicate(listItem))
            match = listItem
    }
    return match
}
