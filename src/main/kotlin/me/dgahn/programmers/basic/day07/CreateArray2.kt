package me.dgahn.programmers.basic.day07

class CreateArray2 {
    fun solution(arr: IntArray): IntArray {
        var stk = mutableListOf<Int>()
        // i를 0으로 초기화
        var i = 0

        // i가 arr의 길이보다 작으면
        while (true) {
            if (i < arr.size) {
                if (stk.isEmpty()) {
                    stk.add(arr[i])
                    i += 1
                } else if (stk.last() < arr[i]) {
                    stk.add(arr[i])
                    i += 1
                } else if (stk.last() >= arr[i]) {
                    stk.removeLast()
                }
            } else {
                break
            }
        }
        return stk.toIntArray()
    }
}