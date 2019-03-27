package com.example.junitdsl

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