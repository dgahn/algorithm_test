package me.dgahn.programmers.basic.day08

class Nine {
    fun solution(number: String): Int {
        var sum = 0
        number.forEach {
            sum += it.digitToInt()
        }
        return sum % 9
    }
}