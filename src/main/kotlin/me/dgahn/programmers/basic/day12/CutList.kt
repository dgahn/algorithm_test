package me.dgahn.programmers.basic.day12

class CutList {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val a = slicer[0]
        val b = slicer[1]
        val c = slicer[2]
        val size = num_list.size

        val answer = when (n) {
            1 -> num_list.slice(0, b)
            2 -> num_list.slice(a, size - 1)
            3 -> num_list.slice(a, b)
            else -> num_list.slice(a, b, c)
        }
        return answer.toIntArray()
    }

    fun IntArray.slice(s: Int, e: Int, p: Int = 1): List<Int> {
        val list = mutableListOf<Int>()
        for (i in s .. e step p) {
            list.add(this[i])
        }
        return list.toList()
    }
}