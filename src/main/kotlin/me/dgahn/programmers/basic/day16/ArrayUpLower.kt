package me.dgahn.programmers.basic.day16

class ArrayUpLower {
    fun solution(strArr: Array<String>): Array<String> {
        for (i in 0 until strArr.size) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].uppercase()
            } else {
                strArr[i] = strArr[i].lowercase()
            }
        }
        return strArr
    }
}