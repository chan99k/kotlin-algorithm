class Prgr_네트워크 {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val parents: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until n) {
            parents[i] = i
        }

        for (i in computers.indices) {
            for (j in computers[i].indices) {
                if (computers[i][j] == 1 && i != j) {
                    parents.unionParents(i, j)
                }
            }
        }

        for (i in 0 until n) {
            parents.findParents(i)  // 모든 노드의 부모를 다시 한 번씩 찾으면서 경로 압축 수행
        }

        return parents.values.toSet().size
    }

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
}