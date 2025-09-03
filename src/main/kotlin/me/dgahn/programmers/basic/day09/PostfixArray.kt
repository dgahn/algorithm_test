package me.dgahn.programmers.basic.day09

class PostfixArray {
    fun solution(my_string: String): Array<String> {
        val size = my_string.length
        val temp = mutableListOf<String>()
        for (i in 1 .. size) {
            temp.add(my_string.substring(size - i, size))
        }
        temp.sort()
        return temp.toTypedArray()
    }
}