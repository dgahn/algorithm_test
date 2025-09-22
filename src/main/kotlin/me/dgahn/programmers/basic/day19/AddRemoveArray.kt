package me.dgahn.programmers.basic.day19

class AddRemoveArray {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in 0 until arr.size) {
            if (flag[i]) {
                repeat(arr[i] * 2) {
                    list.add(arr[i])
                }
            } else {
                repeat(arr[i]) {
                    list.removeLast()
                }
            }
        }
        return list.toIntArray()
    }
}