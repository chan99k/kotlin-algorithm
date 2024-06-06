package utils

import java.util.*
import java.util.stream.Collectors

/**
 * Iterable<T>의 확장 함수로, 주어진 길이(length)의 모든 가능한 조합을 생성하는 함수.
 *
 * Lazy Sequence를 반환하므로, 필요할 때마다 하나씩 조합을 생성.
 *
 * @param length 조합의 길이
 * @return 주어진 길이의 조합을 포함하는 Sequence<List<T>>
 */
fun <T> Iterable<T>.combine(length: Int): Sequence<List<T>> =
    sequence {
        // pool은 현재 Iterable을 List로 변환한 것입니다. 이미 List라면 그대로 사용합니다.
        val pool = this@combine as? List<T> ?: toList()
        val n = pool.size
        // 만약 length가 pool의 크기보다 크다면 빈 Sequence를 반환합니다.
        if (length > n) return@sequence
        // 조합을 나타내는 인덱스 배열을 초기화합니다.
        val indices = IntArray(length) { it }
        while (true) {
            // 현재 인덱스 배열을 기반으로 조합을 생성하여 yield로 반환합니다.
            yield(indices.map { pool[it] })
            var i = length
            do {
                i--
                // i가 -1이 되면 모든 조합을 생성한 것이므로 Sequence 생성을 종료합니다.
                if (i == -1) return@sequence
                // 인덱스 배열을 갱신합니다. (반복문의 종료 조건을 확인합니다.)
            } while (indices[i] == i + n - length)
            indices[i]++
            // 인덱스 배열의 다음 값을 갱신합니다.
            for (j in i + 1 until length) indices[j] = indices[j - 1] + 1
        }
    }

fun combine(n: Int, k: Int): List<List<Int>> {
    val results: MutableList<List<Int>> = mutableListOf()

    fun myDFS(elements: LinkedList<Int>, start: Int, k: Int) {
        if (k == 0) {
            results.add(elements.stream().collect(Collectors.toList()))
            return
        }
        for (i in start..n) {
            elements.add(i)
            myDFS(elements, i + 1, k - 1)
            elements.removeLast()
        }
    }
    myDFS(LinkedList(), 1, k)
    return results
}