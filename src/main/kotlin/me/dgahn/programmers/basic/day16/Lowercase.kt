package me.dgahn.programmers.basic.day16

class Lowercase {
    fun solution(myString: String): String {
        "ABC".uppercase()
        return myString.toList().joinToString("") { it.lowercase() }
    }
}