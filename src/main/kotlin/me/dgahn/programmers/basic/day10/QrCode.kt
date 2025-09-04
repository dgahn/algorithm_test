package me.dgahn.programmers.basic.day10

class QrCode {
    fun solution(q: Int, r: Int, code: String): String {
        val chars = mutableListOf<Char>()
        for (i in code.indices) {
            if (i % q == r) {
                chars.add(code[i])
            }
        }
        return chars.joinToString("")
    }
}