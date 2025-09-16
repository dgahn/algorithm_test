package me.dgahn.programmers.basic.day17_18

class SplitManyBlank {
    fun solution(my_string: String): Array<String> {
        return my_string.split(" ").filter { it.isNotBlank() }.toTypedArray()
    }
}