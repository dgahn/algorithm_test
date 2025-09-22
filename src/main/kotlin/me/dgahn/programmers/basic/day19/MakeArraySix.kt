package me.dgahn.programmers.basic.day19

class MakeArraySix {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()

        for (i in 0 until arr.size) {
            if (stk.isEmpty()) {
                stk.add(arr[i])
            } else if (stk.isNotEmpty() && stk.last() == arr[i]) {
                stk.removeLast()
            } else if (stk.isNotEmpty() && stk.last() != arr[i]) {
                stk.add(arr[i])
            }
        }
        return if (stk.isEmpty()) IntArray(1) { -1 } else stk.toIntArray()
    }
}