package me.dgahn.programmers.basic.day05

class CodeString {
    fun solution(code: String): String {
        var mode = 0
        val stringBuilder = StringBuilder()
        for (i in 0 until code.length) {
            val c = code[i]
            if (mode == 0) {
                if (c != '1' && i % 2 == 0) {
                    stringBuilder.append(c)
                } else if (c == '1') {
                    mode = 1
                }
            } else {
                if (c != '1' && i % 2 == 1) {
                    stringBuilder.append(c)
                } else if (c == '1') {
                    mode = 0
                }
            }
        }

        val result = stringBuilder.toString()
        return if (result.isEmpty()) {
            "EMPTY"
        } else {
            result
        }
    }
}