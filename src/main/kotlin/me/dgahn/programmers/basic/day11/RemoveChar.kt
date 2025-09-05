package me.dgahn.programmers.basic.day11

class RemoveChar {
    fun solution(my_string: String, indices: IntArray): String {
        val answer = CharArray(my_string.length)
        for (i in my_string.indices) {
            if (!indices.contains(i)) {
                answer[i] = my_string[i]
            }
        }
        return answer.filterNot { it == '\u0000' }
            .joinToString("") { it.toString() }
    }
}