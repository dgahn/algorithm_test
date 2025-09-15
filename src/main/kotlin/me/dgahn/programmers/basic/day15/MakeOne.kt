package me.dgahn.programmers.basic.day15

class MakeOne {
    fun solution(num_list: IntArray): Int {
        var answer = 0
        val result = IntArray(num_list.size) { 1 }
        while (true) {
            for (i in 0 until num_list.size) {
                when {
                    num_list[i] == 1 -> {

                    }
                    num_list[i] % 2 == 0 -> {
                        answer++
                        num_list[i] = num_list[i] / 2
                    }
                    else -> {
                        answer++
                        num_list[i] = (num_list[i] - 1) / 2
                    }
                }
            }
            if (num_list.contentEquals(result)) {
                return answer
            }
        }
    }
}