package me.dgahn.programmers.basic.day10

class ReverseString {
    fun solution(my_string: String, s: Int, e: Int): String {
        val chars = my_string.toCharArray()
        var start = s
        var end = e
        while (start < end) {
            val temp = chars[start]
            chars[start] = chars[end]
            chars[end] = temp
            start++
            end--
        }
        return chars.joinToString("")
    }
}