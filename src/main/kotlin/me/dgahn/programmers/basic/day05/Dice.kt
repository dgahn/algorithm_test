package me.dgahn.programmers.basic.day05

class Dice {
    fun solution(a: Int, b: Int, c: Int): Int {
        val set = setOf(a, b, c)

        return when(set.size) {
            1 -> (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
            2 -> (a + b + c) * (a * a + b * b + c * c)
            else -> a + b + c
        }
    }
}