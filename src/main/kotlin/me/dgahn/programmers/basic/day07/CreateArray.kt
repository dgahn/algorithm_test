package me.dgahn.programmers.basic.day07

class CreateArray {
    fun solution(l: Int, r: Int): IntArray {
        val answer = mutableListOf<Int>()
        // l 이상 r이하 정수 중에
        for (num in l .. r) {
            val str = num.toString()
            val bool = str.all { it == '0' || it == '5' }
            if (bool) {
                answer.add(num)
            }
        }

        return if (answer.isEmpty()) {
            intArrayOf(-1)
        } else {
            answer.toIntArray()
        }
    }
}