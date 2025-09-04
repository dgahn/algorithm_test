package me.dgahn.programmers.basic.day10

class CrossRead {
    fun solution(my_string: String, m: Int, c: Int): String {
        val size = my_string.length
        val list = mutableListOf<String>()
        for (i in 0 .. size - m step m) {
            list.add(my_string.substring(i, i + m))
        }
        return list.joinToString("") { it[c-1].toString() }
    }
}