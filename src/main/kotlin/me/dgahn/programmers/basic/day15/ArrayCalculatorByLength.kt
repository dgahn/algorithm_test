package me.dgahn.programmers.basic.day15

class ArrayCalculatorByLength {
    fun solution(num_list: IntArray): Int {
        return if (num_list.size >= 11) {
            num_list.sum()
        } else {
            num_list.reduce { acc, x -> acc * x}
        }
    }
}