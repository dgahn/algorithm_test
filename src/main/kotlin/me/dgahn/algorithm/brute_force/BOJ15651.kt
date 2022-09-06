package me.dgahn.algorithm.brute_force

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

fun main() {
    input()
    recFunc(1)
    println(sb.toString())
}

var sb = StringBuilder()

fun input() {
    val scan = FastReader()
    N = scan.nextInt()
    M = scan.nextInt()
    selected = IntArray(M + 1)
}

var N = 0
var M = 0
var selected: IntArray? = null

// Recurrence Function (재귀 함수)
// 만약 M 개를 전부 고름   => 조건에 맞는 탐색을 한 가지 성공한 것!
// 아직 M 개를 고르지 않음 => k 번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도한다.
fun recFunc(k: Int) {
    if (k == M + 1) { // 다 골랐다!
        // selected[1...M] 배열이 새롭게 탐색된 결과
        for (i in 1..M) sb.append(selected!![i]).append(' ')
        sb.append('\n')
    } else {
        for (cand in 1..N) {
            // k 번째에 cand 가 올 수 있으면
            selected!![k] = cand

            // k+1 번부터 M 번까지 잘 채워주는 함수를 호출해준다.
            recFunc(k + 1)
        }
    }
}

class FastReader {
    private val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null

    operator fun next(): String {
        while (st == null || !st!!.hasMoreElements()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt(): Int {
        return next().toInt()
    }

    fun nextLong(): Long {
        return next().toLong()
    }

    fun nextDouble(): Double {
        return next().toDouble()
    }

    fun nextLine(): String {
        var str = ""
        try {
            str = br.readLine()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return str
    }
}
