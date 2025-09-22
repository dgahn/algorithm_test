package me.dgahn.programmers.basic.day19

class Splitabc {
    fun solution(myStr: String): Array<String> {
        return myStr.split("a")
            .flatMap { it.split("b") }
            .flatMap { it.split("c") }
            .filter{ it.isNotBlank() }
            .let { if(it.isEmpty()) listOf("EMPTY") else it  }
            .toTypedArray()
    }
}