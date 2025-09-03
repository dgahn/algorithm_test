package me.dgahn.programmers.basic.day09

class PostfixContain {
    fun solution(my_string: String, is_suffix: String): Int {
        val size = my_string.length
        val list = mutableListOf<String>()
        for (i in 1 .. size) {
            list.add(my_string.substring(size - i, size))
        }
        return if (list.contains(is_suffix)) 1 else 0
    }
}