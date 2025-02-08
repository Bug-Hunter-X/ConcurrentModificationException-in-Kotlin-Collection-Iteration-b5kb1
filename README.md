# ConcurrentModificationException in Kotlin

This repository demonstrates a common error in Kotlin when modifying a collection while iterating over it using a standard `for` loop.  The code includes an example showing how to safely remove elements from a list, using `removeIf` for mutable collections or iterating over a copy of the collection using `.toMutableList()`.