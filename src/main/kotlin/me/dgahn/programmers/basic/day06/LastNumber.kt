package me.dgahn.programmers.basic.day06

class LastNumber {
    fun solution(num_list: IntArray): IntArray {
        val size = num_list.size
        val last = num_list[size - 1]
        val before = num_list[size - 2]
        val answer = if (last > before) {
            num_list + (last - before)
        } else {
            num_list + (last * 2)
        }

        return answer
    }
}