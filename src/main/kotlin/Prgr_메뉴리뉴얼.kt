class Prgr_메뉴리뉴얼 {
    private fun <T> Iterable<T>.combine(length: Int): Sequence<List<T>> =
        sequence {
            val pool = this@combine as? List<T> ?: toList()
            val n = pool.size
            if (length > n) return@sequence
            val indices = IntArray(length) { it }
            while (true) {
                yield(indices.map { pool[it] })
                var i = length
                do {
                    i--
                    if (i == -1) return@sequence
                } while (indices[i] == i + n - length)
                indices[i]++
                for (j in i + 1 until length) {
                    indices[j] = indices[j - 1] + 1
                }
            }
        }

    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val answer: MutableList<String> = mutableListOf()

        for (num in course) {
            val map: MutableMap<String, Int> = mutableMapOf()
            for (order in orders) {
                val dishes = order.split("").filter { it.isNotEmpty() }
                val comb = dishes.combine(num)
                for (c in comb) {
                    val candidate = c.sorted().joinToString(separator = "") { it }
                    map[candidate] = map.getOrPut(candidate) { 0 } + 1
                }
            }

            val maxCount = map.maxOfOrNull { it.value }
            if (maxCount == null || maxCount < 2) continue
            map.iterator().forEach {
                if (it.value == maxCount) {
                    answer.add(it.key)
                }
            }
        }
        return answer.sorted().toTypedArray()
    }
}