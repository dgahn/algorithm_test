package me.dgahn.programmers.basic.day07

class Collatz {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()
        var x = n
        while (true) {
            answer.add(x)
            if (x == 1) {
                break
            } else if (x % 2 == 0) {
                x = x / 2
            } else {
                x = 3*x + 1
            }
        }

        return answer.toIntArray()
    }
}