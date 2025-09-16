package me.dgahn.programmers.basic.day17_18

class SubstringCount {
    fun solution(myString: String, pat: String): Int {
        var count = 0
        for (i in 0 until myString.length) {
            if(myString.substring(i, myString.length).startsWith(pat)) {
                count++
            }
        }
        return count
    }
}