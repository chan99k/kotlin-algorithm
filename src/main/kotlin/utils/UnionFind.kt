package utils

/**
 * 배열
 */
fun findParents(parent: IntArray, idx: Int): Int {
    if (parent[idx] == idx) {
        return idx
    }
    return findParents(parent, parent[idx])
}

fun unionParents(parent: IntArray, a: Int, b: Int) {
    val aParent = findParents(parent, a)
    val bParent = findParents(parent, b)
    if (aParent > bParent) {
        parent[aParent] = parent[bParent]
    } else {
        parent[bParent] = parent[aParent]
    }
}

/**
 * 맵
 */
private fun MutableMap<Int, Int>.findParents(idx: Int): Int {
    if (idx != this[idx]) { // 다른 노드를 부모로 가진다면
        this[idx] = findParents(this[idx]!!)  // 경로 압축 실행
    }
    return this[idx]!!
}

private fun MutableMap<Int, Int>.unionParents(a: Int, b: Int) {
    val aParent = findParents(a)
    val bParent = findParents(b)
    if (aParent > bParent) {
        this[aParent] = this[bParent]!!
    } else {
        this[bParent] = this[aParent]!!
    }
}


fun main() {
    val graph = arrayOf(
        intArrayOf(1, 2, 6),
        intArrayOf(1, 3, 3),
        intArrayOf(1, 4, 1),
        intArrayOf(2, 5, 4),
        intArrayOf(3, 4, 2),
        intArrayOf(3, 5, 5),
        intArrayOf(4, 5, 7)
    )
    val parents: MutableMap<Int, Int> = HashMap()
    var total = 0
    graph.sortedByDescending { it[2] }.forEach { ints ->
        if (parents.findParents(ints[0]) != parents.findParents(ints[1])) {
            total += ints[2]
            parents.unionParents(ints[0], ints[1])
        }
    }

    for (i in 0 until total) {
        parents.findParents(i)  // 모든 노드의 부모를 다시 한 번씩 찾으면서 경로 압축 수행
    }
    println(total)
}

