package me.dgahn.programmers.basic.day08

class IndexList {
    fun solution(my_string: String, index_list: IntArray): String {
        val stringBuilder = StringBuilder()
        for (i in index_list) {
            stringBuilder.append(my_string[i])
        }
        return stringBuilder.toString()
    }
}