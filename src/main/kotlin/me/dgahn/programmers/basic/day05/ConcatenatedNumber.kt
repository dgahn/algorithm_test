package me.dgahn.programmers.basic.day05

class ConcatenatedNumber {
    fun solution(num_list: IntArray): Int {
        val odd = StringBuilder()
        val even = StringBuilder()
        for (idx in num_list.indices) {
            if (num_list[idx] % 2 == 1) {
                odd.append(num_list[idx].toString())
            } else {
                even.append(num_list[idx].toString())
            }
        }
        return odd.toString().toInt() + even.toString().toInt()
    }
}