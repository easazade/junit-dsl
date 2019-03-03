package com.example.junitdsl

import org.junit.Assert

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
