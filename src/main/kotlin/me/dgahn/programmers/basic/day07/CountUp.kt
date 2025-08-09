package me.dgahn.programmers.basic.day07

class CountUp {
    fun solution(start_num: Int, end_num: Int): IntArray {
        val list = mutableListOf<Int>()
        for (num in start_num .. end_num) {
            list.add(num)
        }
        return list.toIntArray()
    }
}