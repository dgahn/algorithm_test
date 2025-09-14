package me.dgahn.programmers.basic.day13

class ConvertToOrder {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val list1 = mutableListOf<Int>()
        for (i in 0 until n) {
            list1.add(num_list[i])
        }
        val list2 = mutableListOf<Int>()
        for (i in n until num_list.size) {
            list2.add(num_list[i])
        }

        return (list2 + list1).toIntArray()
    }
}