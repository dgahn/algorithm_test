package me.dgahn.programmers.basic.day13

class LeftRight {
    fun solution(str_list: Array<String>): Array<String> {
        for (i in 0 until str_list.size) {
            when(str_list[i]) {
                "l" -> return str_list.copyOfRange(0, i)
                "r" -> return str_list.copyOfRange(i + 1, str_list.size)
            }
        }
        return emptyArray()
    }
}
