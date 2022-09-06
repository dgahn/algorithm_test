package me.dgahn.algorithm.brute_force

import kotlin.math.max

private class Solution02 {
    fun solution(answers: IntArray): IntArray {
        val first = intArrayOf(1, 2, 3, 4, 5)
        val second = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val third = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var firstCount = 0
        var secondCount = 0
        var thirdCount = 0
        answers.forEachIndexed { i, answer ->
            if (first[i % first.size] == answer) {
                firstCount++
            }
            if (second[i % second.size] == answer) {
                secondCount++
            }
            if (third[i % third.size] == answer) {
                thirdCount++
            }
        }
        val maxCount = max(firstCount, max(secondCount, thirdCount))

        val result = mutableListOf<Int>()
        if (maxCount == firstCount) {
            result.add(1)
        }
        if (maxCount == secondCount) {
            result.add(2)
        }
        if (maxCount == thirdCount) {
            result.add(3)
        }
        return result.toIntArray()
    }
}

fun main() {
    val solution = Solution02()
    val input = listOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 3, 2, 4, 2)
    )
    input.forEach { println(solution.solution(it).toList()) }
}