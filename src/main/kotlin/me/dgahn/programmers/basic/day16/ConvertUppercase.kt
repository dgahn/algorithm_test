package me.dgahn.programmers.basic.day16

class ConvertUppercase {
    fun solution(my_string: String, alp: String): String {
        val list = mutableListOf<String>()
        for (i in 0 until my_string.length) {
            val str = my_string[i].toString()
            if (str == alp) {
                list.add(str.uppercase())
            } else {
                list.add(str)
            }
        }
        return list.joinToString("")
    }
}