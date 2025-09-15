package me.dgahn.programmers.basic.day14

class PerFive {
    fun solution(names: Array<String>): Array<String> {
        val list = mutableListOf<String>()
        for (i in 0 until names.size) {
            if (i % 5 == 0) {
                list.add(names[i])
            }
        }

        return list.toTypedArray()
    }
}