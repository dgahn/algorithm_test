package me.dgahn.programmers.basic.day12

class AreaOfTwo {
    fun solution(arr: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in arr.indices) {
            if (arr[i] == 2) {
                list.add(i)
            }
        }
        if (list.isEmpty()) {
            return intArrayOf(-1)
        }

        val s = list.first()
        val e = list.last()

        val answer = mutableListOf<Int>()
        for (i in s .. e) {
            answer.add(arr[i])
        }
        return answer.toIntArray()
    }
}