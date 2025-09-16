package me.dgahn.programmers.basic.day17_18

class RemoveContainAd {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.filter { !it.contains("ad") }
            .toTypedArray()
    }
}