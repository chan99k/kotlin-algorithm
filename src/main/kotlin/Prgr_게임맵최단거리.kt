class Prgr_게임맵최단거리 {
    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(-1, 0, 1, 0)

    fun solution(maps: Array<IntArray>): Int {
        val n = maps.size
        val m = maps[0].size
        val queue = ArrayDeque<Node>()
        val visited = Array(n + 1) { BooleanArray(m + 1) { false } }

        queue.addLast(Node(0, 0, 0))
        while (!queue.isEmpty()) {
            val curr = queue.removeFirst()
            if (curr.x == n - 1 && curr.y == m - 1) return curr.dist + 1

            for (i in dx.indices) {
                val nx = curr.x + dx[i]
                val ny = curr.y + dy[i]
                if (nx in 0 until n && ny in 0 until m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true
                    queue.addLast(Node(nx, ny, curr.dist + 1))
                }
            }
        }
        return -1
    }

    private data class Node(val x: Int, val y: Int, val dist: Int)
}
