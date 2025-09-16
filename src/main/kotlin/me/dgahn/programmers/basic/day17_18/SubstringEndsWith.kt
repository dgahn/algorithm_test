package me.dgahn.programmers.basic.day17_18

class SubstringEndsWith {
    fun solution(myString: String, pat: String): String {
        val index = myString.lastIndexOf(pat)
        return myString.substring(0, index + pat.length)
    }
}