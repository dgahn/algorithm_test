package me.dgahn.programmers.basic.day17_18

class SeachString {
    fun solution(myString: String, pat: String): Int {
        val new = myString.map {
            if (it == 'A') {
                'B'
            } else {
                'A'
            }
        }.joinToString("")
        return if (new.contains(pat)) 1 else 0
    }
}