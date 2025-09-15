package me.dgahn.programmers.basic.day14

class Sequence {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (idx in 0 until queries.size) {
            val query = queries[idx]
            val s = query.first()
            val e = query.last()

            for (i in s .. e) {
                arr[i] += 1
            }
        }
        return arr
    }
}