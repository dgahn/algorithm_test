package me.dgahn.programmers.basic.day07

class AddNumber {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (pos in 0 until queries.size) {
            val query = queries[pos]

            val s = query[0]
            val e = query[1]
            val k = query[2]

            for (i in s .. e) {
                if (i % k == 0) {
                    arr[i] += 1
                }
            }
        }
        return arr
    }
}