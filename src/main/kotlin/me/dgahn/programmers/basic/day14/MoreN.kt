package me.dgahn.programmers.basic.day14

class MoreN {
    fun solution(numbers: IntArray, n: Int): Int {
        var sum = 0
        for (i in 0 until numbers.size) {
            sum += numbers[i]
            if(sum > n) {
                return sum
            }
        }

        return sum
    }
}