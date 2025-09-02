package me.dgahn.programmers.basic.day08

class SimpleBoolean {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        return (x1 || x2) && (x3 || x4)
    }
}