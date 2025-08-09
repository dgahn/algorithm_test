package me.dgahn.programmers.basic.day06

class NumberConvert {
    fun solution(n: Int, control: String): Int {
        var result = n
        for (idx in control.indices) {
            if (control[idx] == 'w') {
                result = result + 1
            } else if (control[idx] == 's') {
                result = result - 1
            } else if (control[idx] == 'd') {
                result = result + 10
            } else {
                result = result - 10
            }

        }
        return result
    }
}