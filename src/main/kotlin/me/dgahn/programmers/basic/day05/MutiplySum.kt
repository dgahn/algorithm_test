package me.dgahn.programmers.basic.day05

class MutiplySum {
    fun solution(num_list: IntArray): Int {
        var sum1 = 1
        for (idx in num_list.indices) {
            sum1 *= num_list[idx]
        }

        val sum2 = square(num_list.sum())

        return if(sum1 <= sum2) 1 else 0
    }

    fun square(n: Int): Int {
        return n * n
    }
}