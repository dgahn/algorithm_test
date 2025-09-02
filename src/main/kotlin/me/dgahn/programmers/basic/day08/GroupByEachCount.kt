package me.dgahn.programmers.basic.day08

class GroupByEachCount {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val numbers = listOf(a, b, c, d)
        val counts = numbers.groupingBy { it }.eachCount()
        val maxCount = counts.entries.maxOfOrNull { it.value }!!

        val answer = when {
            // 네 숫자가 모두 같은 경우
            counts.size == 1 -> {
                1111 * counts.keys.first()
            }
            // 세 숫자만 같은 경우
            maxCount == 3 -> {
                val p = counts.entries.first { it.value == 3 }.key
                val q = counts.entries.first { it.value == 1 }.key
                (10 * p + q) * (10 * p + q)
            }
            // 숫자가 두개씩 같은 경우
            counts.size == 2 -> {
                val p = counts.keys.first()
                val q = counts.keys.last()
                (p + q) * (kotlin.math.abs(p - q))
            }
            // 숫자가 2개 같고 한개씩 다른 경우
            maxCount == 2 -> {
                val qr = counts.entries.filter { it.value == 1 }
                val q = qr.first().key
                val r = qr.last().key
                q * r
            }
            else -> numbers.minOrNull()!!
        }

        return answer
    }
}