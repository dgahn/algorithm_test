package me.dgahn.programmers.basic.day03

class StringMerge {
    fun solution(arr: Array<String>): String {
        val stringBuilder = StringBuilder()
        arr.forEach {
            stringBuilder.append(it)
        }
        return stringBuilder.toString()
    }
}