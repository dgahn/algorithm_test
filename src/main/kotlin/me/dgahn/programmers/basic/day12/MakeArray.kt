package me.dgahn.programmers.basic.day12

class MakeArray {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val interval1 = intervals.first()
        val interval2 = intervals.last()

        val arr1 = arr.slice(interval1.first(), interval1.last())
        val arr2 = arr.slice(interval2.first(), interval2.last())

        return (arr1 + arr2).toIntArray()
    }

    fun IntArray.slice(s: Int, e: Int): List<Int> {
        val list = mutableListOf<Int>()
        for (i in s .. e) {
            list.add(this[i])
        }
        return list.toList()
    }
}