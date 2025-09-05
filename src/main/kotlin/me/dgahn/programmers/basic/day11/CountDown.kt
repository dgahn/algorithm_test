package me.dgahn.programmers.basic.day11

class CountDown {
    fun solution(start_num: Int, end_num: Int): IntArray {
        val list = mutableListOf<Int>()
        for (i in end_num .. start_num) {
            list.add(i)
        }
        return list.reversed().toIntArray()
    }
}