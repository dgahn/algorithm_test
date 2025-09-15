package me.dgahn.programmers.basic.day14

class OddEven {
    fun solution(num_list: IntArray): Int {
        var odd = 0
        var even = 0
        for (i in 0 until num_list.size) {
            if ((i + 1) % 2 == 1) {
                odd += num_list[i]
            } else {
                even += num_list[i]
            }
        }
        return if (odd >= even) odd else even
    }
}