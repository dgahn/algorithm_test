package me.dgahn.programmers.basic.day04

class OddEven {
    fun solution(n: Int): Int {
        return if (n % 2 == 1) {
            sumOdd(n)
        } else {
            sumEven(n)
        }
    }

    fun sumOdd(n: Int): Int {
        var sum = 0
        for (i in 1 .. n) {
            if (i % 2 == 1) {
                sum += i
            }
        }
        return sum
    }

    fun sumEven(n: Int): Int {
        var sum = 0
        for (i in 1 .. n) {
            if (i % 2 == 0) {
                sum += i * i
            }
        }
        return sum
    }
}