package me.dgahn.programmers.basic.day12

class ArrayPiece {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        // query를 돌면서
        var answer = arr
        for (i in query.indices) {
            if (i % 2 == 0) {
                answer = answer.slice(0, query[i])
            } else {
                val size = answer.size
                answer = answer.slice(query[i], size - 1)
            }
        }
        return answer
    }

    fun IntArray.slice(s: Int, e: Int): IntArray {
        val list = mutableListOf<Int>()
        for (i in s .. e) {
            list.add(this[i])
        }
        return list.toIntArray()
    }
}