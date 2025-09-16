package me.dgahn.programmers.basic.day17_18

class SplitXPerLength {
    fun solution(myString: String): IntArray {
        return myString.split("x").map { it.length }.toIntArray()
    }
}