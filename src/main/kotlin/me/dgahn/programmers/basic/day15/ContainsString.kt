package me.dgahn.programmers.basic.day15

class ContainsString {
    fun solution(myString: String, pat: String): Int {
        return if (myString.contains(pat, ignoreCase = true)) 1 else 0
    }
}