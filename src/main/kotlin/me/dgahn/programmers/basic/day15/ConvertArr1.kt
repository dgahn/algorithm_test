package me.dgahn.programmers.basic.day15

class ConvertArr1 {
    fun solution(arr: IntArray): IntArray {
        for (i in 0 until arr.size) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2
            }
        }
        return arr
    }
}