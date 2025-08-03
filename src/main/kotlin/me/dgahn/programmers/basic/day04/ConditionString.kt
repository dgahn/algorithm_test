package me.dgahn.programmers.basic.day04

class ConditionString {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val result = if (ineq == ">" && eq == "=") {
            n >= m
        } else if (ineq == "<" && eq == "=") {
            n <= m
        } else if (ineq == ">" && eq == "!") {
            n > m
        } else {
            n < m
        }

        return if(result) 1 else 0
    }
}