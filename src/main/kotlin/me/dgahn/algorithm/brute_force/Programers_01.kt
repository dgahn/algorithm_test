package me.dgahn.algorithm.brute_force

import kotlin.math.min

private class Solution01 {
    fun solution(sizes: Array<IntArray>): Int {
        val max = sizes.flatMap { it.toSet() }.maxOf { it }
        var anotherMax = 0
        sizes.forEach { array ->
            val min = min(array.first() ,array.last())
            if(anotherMax < min) {
                anotherMax = min
            }
        }
        return max * anotherMax
    }
}

fun main() {
    val solution = Solution01()
    val input = listOf(
        arrayOf(
            intArrayOf(60, 50),
            intArrayOf(30, 70),
            intArrayOf(60, 30),
            intArrayOf(80, 40),
        ),
        arrayOf(
            intArrayOf(10, 7),
            intArrayOf(12, 3),
            intArrayOf(8, 15),
            intArrayOf(14, 7),
            intArrayOf(5, 15),
        ),
        arrayOf(
            intArrayOf(14, 4),
            intArrayOf(19, 6),
            intArrayOf(6, 16),
            intArrayOf(18, 7),
            intArrayOf(7, 11),
        )
    )
    input.forEach { println(solution.solution(it)) }
}