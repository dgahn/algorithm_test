package me.dgahn.programmers.basic.day09

class ArrayFive {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        return intStrs.map { it.substring(s, s + l).toInt() }
            .filter { it > k }
            .toIntArray()
    }
}