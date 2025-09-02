package me.dgahn.programmers.basic.day08

class SubReverse {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        // queries s -> e 까지 뒤집어라
        val chars = my_string.toCharArray()

        for(q in queries) {
            var s = q[0]
            var e = q[1]
            while(s < e) {
                val tmp = chars[s]
                chars[s] = chars[e]
                chars[e] = tmp
                s++
                e--
            }
        }

        return String(chars)
    }
}