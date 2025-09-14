package me.dgahn.programmers.basic.day13

class NtoLast {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>()
        for (i in n - 1 until num_list.size) {
            list.add(num_list[i])
        }
        return list.toIntArray()
    }
}