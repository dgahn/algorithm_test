package me.dgahn.programmers.basic.day06

class SwitchNumber {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (i in 0 until queries.size) {
            val position = queries[i]
            val pos1 = position[0]
            val pos2 = position[1]
            val first = arr[pos1]
            val second = arr[pos2]

            arr[pos1] = second
            arr[pos2] = first
        }
        return arr
    }
}