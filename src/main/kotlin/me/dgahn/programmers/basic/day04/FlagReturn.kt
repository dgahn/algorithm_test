package me.dgahn.programmers.basic.day04

class FlagReturn {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if (flag) {
            a + b
        } else {
            a - b
        }
    }
}