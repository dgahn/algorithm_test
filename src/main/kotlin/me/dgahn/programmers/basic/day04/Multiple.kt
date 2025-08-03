package me.dgahn.programmers.basic.day04

class Multiple {
    fun solution(num: Int, n: Int): Int {
        return if ((num % n) == 0) 1 else 0
    }
}