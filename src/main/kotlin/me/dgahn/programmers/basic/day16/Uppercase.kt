package me.dgahn.programmers.basic.day16

class Uppercase {
    fun solution(myString: String): String {
        return myString.toList().joinToString("") { it.uppercase() }
    }
}