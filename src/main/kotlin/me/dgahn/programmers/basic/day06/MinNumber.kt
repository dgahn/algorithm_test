package me.dgahn.programmers.basic.day06

class MinNumber {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer: IntArray = IntArray(queries.size)
        for (pos in 0 until queries.size) {
            val query = queries[pos]
            val s = query[0]
            val e = query[1]
            val k = query[2]

            // s <= i <= e
            val iList = mutableListOf<Int>()
            for (i in s..e) {
                // i가 arr 보다 사이즈가 크면 함수를 끝냈다.
                if (i >= arr.size) {
                    break
                }
                // s 부터 e 까지 돌면 i인데 중에 k보다 큰 것만 저장한다.
                if (arr[i] > k) {
                    iList.add(arr[i])
                }
            }
            if (iList.isEmpty()) {
                answer[pos] = -1
            } else {
                answer[pos] = iList.minOrNull() ?: -1
            }
        }
        return answer
    }
}