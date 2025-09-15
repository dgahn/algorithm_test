package me.dgahn.programmers.basic.day15

class ConvertArr2 {
    fun solution(arr: IntArray): Int {
        var x = 0
        var temp = arr.copyOfRange(0, arr.size)
        while (true) {
            for (i in 0 until arr.size) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1
                }
            }

            if (arr.contentEquals(temp)) {
                return x
            } else {
                temp = arr.copyOfRange(0, arr.size)
                x++
            }
        }
    }
}