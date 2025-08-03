package me.dgahn.programmers.basic.day03

class StringMoreBigMore2 {
    fun solution(a: Int, b: Int): Int {
        // a + b
        val merge = merge(a, b)

        // 2 * a * b
        val merge2 = merge2(a, b)

        return if (merge >= merge2) merge else merge2
    }

    fun merge(x: Int, y: Int): Int {
        return (x.toString() + y.toString()).toInt()
    }

    fun merge2(x: Int, y: Int): Int {
        return 2 * x * y
    }
}