package me.dgahn.programmers.basic.day06

class NumLog {
    fun solution(numLog: IntArray): String {
        val stringBuilder = StringBuilder()
        for (i in 1 until numLog.size) {
            val diff = numLog[i] - numLog[i - 1]
            val str = when(diff) {
                1 -> "w"
                -1 -> "s"
                10 -> "d"
                else -> "a"
            }
            stringBuilder.append(str)
        }

        return stringBuilder.toString()
    }
}