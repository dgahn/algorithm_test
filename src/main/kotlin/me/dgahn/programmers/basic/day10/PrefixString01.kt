package me.dgahn.programmers.basic.day10

class PrefixString01 {
    fun solution(my_string: String, is_prefix: String): Int {
        return if(my_string.startsWith(is_prefix)) 1 else 0
    }
}