package me.dgahn.programmers.basic.day03

class StringMixer {
    fun solution(str1: String, str2: String): String {
        val size = str1.length
        val stringBuilder = StringBuilder()
        for (i in 0 until size) {
            stringBuilder.append(str1[i])
            stringBuilder.append(str2[i])
        }
        return stringBuilder.toString()
    }
}