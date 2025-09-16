package me.dgahn.programmers.basic.day16

class ForceA {
    fun solution(myString: String): String {
        val list = mutableListOf<String>()
        for (i in 0 until myString.length) {
            if (myString[i] == 'a') {
                list.add("A")
            } else if (myString[i] == 'A') {
                list.add(myString[i].toString())
            } else if (myString[i] > 'A' && myString[i] < 'a') {
                list.add(myString[i].lowercase())
            } else {
                list.add(myString[i].toString())
            }
        }

        return list.joinToString("")
    }
}