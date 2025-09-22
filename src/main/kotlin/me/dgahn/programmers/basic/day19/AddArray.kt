package me.dgahn.programmers.basic.day19

class AddArray {
    fun solution(arr: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in 0 until arr.size) {
            repeat(arr[i]) {
                list.add(arr[i])
            }
        }
        return list.toIntArray()
    }
}