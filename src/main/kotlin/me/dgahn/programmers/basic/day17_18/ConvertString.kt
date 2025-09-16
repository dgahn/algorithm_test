package me.dgahn.programmers.basic.day17_18

class ConvertString {
    fun solution(rny_string: String): String {
        val list = mutableListOf<String>()
        for (i in 0 until rny_string.length) {
            if (rny_string[i] == 'm') {
                list.add("rn")
            } else {
                list.add(rny_string[i].toString())
            }
        }
        return list.joinToString("")
    }
}