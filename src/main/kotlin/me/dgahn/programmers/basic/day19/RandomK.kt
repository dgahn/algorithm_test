package me.dgahn.programmers.basic.day19

class RandomK {
    fun solution(arr: IntArray, k: Int): IntArray {
        val set = arr.toSet().toList()
        val list = mutableListOf<Int>()
        for (i in 0 until k) {
            if (i < set.size) {
                list.add(set[i])
            } else {
                list.add(-1)
            }
        }
        return list.toIntArray()
    }
}