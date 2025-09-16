package me.dgahn.programmers.basic.day17_18

class CalculateSentence {
    fun solution(binomial: String): Int {
        val list = listOf("+", "-", "*")
        var answer = 0
        for(op in list) {
            val numbers = binomial.split(op)
            if (numbers.size == 2) {
                val a = numbers.first().trim().toInt()
                val b = numbers.last().trim().toInt()
                answer = when (op) {
                    "+" -> a + b
                    "-" -> a - b
                    else -> a * b
                }
            }
        }
        return answer
    }
}