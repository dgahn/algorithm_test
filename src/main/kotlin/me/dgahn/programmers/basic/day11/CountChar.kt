package me.dgahn.programmers.basic.day11

class CountChar {
    fun solution(my_string: String): IntArray {
        val answer: IntArray = IntArray(52)
        my_string.forEach {
            val c = if (it.toInt() >= 'a'.toInt()) {
                it.toInt() - 'A'.toInt() - 6
            } else {
                it.toInt() - 'A'.toInt()
            }
            answer[c] = answer[c] + 1
        }
        return answer
    }
}