package me.dgahn.programmers.basic.day17_18

class SplitXSorted {
    fun solution(myString: String): Array<String> {
        return myString.split("x").filter { it.isNotBlank() }.sorted().toTypedArray()
    }
}