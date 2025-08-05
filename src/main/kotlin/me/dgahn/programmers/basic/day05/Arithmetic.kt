package me.dgahn.programmers.basic.day05

class Arithmetic {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        // included true일 때 i만큼 d를 곱해서 더하면 됨

        var sum = 0
        for (i in included.indices) {
            if(included[i]) {
                sum += a + d * i
            }
        }

        return sum
    }
}