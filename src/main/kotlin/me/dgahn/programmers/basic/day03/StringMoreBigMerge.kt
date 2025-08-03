package me.dgahn.programmers.basic.day03

class StringMoreBigMerge {
    fun solution(a: Int, b: Int): Int {
        // a + b 만들기
        val merged1 = merge(a, b)

        // b + a 만들기
        val merged2 = merge(b, a)

        return if (merged1 > merged2) merged1 else merged2
    }

    fun merge(x: Int, y: Int): Int {
        return (x.toString() + y.toString()).toInt()
    }
}