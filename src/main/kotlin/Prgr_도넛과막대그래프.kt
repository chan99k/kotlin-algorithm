class Prgr_도넛과막대그래프 {
    /**
     * input  방향성이 있는 (출발정점,도착정점) 간선들의 배열
     *
     * 자기 자신으로 돌아오는 사이클이 하나 존재하면 도넛 -> 정점에서 나가는 간선의 수 - 8자 그래프의 개수 - 막대 그래프의 개수 = 도넛 그래프의 수
     * 자기 자신으로 돌아오는 사이클이 둘 존재하면 8 -> 들어오는 간선이 둘, 나가는 간선이 둘 있으면 8자 +1
     * 자기 자신으로 돌아오는 사이클이 없으면 막대 -> 들어오는 간선은 있지만 나가는 간선이 없으면 막대 +1
     * 나가는 간선이 둘 이상 있는데 들어오는 간선이 없으면 생성 정점
     *
     * return 생성한 정점의 번호, 도넛 모양 그래프의 수, 막대 모양 그래프의 수, 8자 모양 그래프의 수를 순서대로 1차원 정수 배열에 담은 배열
     */

    fun solution(edges: Array<IntArray>): IntArray {
//      println(edges.contentDeepToString())
        val out: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        val inn: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        val nodes: MutableSet<Int> = mutableSetOf()

        setUp(edges, nodes, out, inn)

        var makdae = 0
        var eight = 0
        var start = -1
        for (node in nodes) {
            if (!out.containsKey(node) && inn.containsKey(node)) {
                makdae++
                continue
            }
            if (out[node]!!.size >= 2 && !inn.containsKey(node)) {
                start = node
                continue
            }
            if (out[node]!!.size >= 2 && inn[node]!!.size >= 2) {
                eight++
                continue
            }
        }
        return intArrayOf(start, out[start]!!.size - makdae - eight, makdae, eight)
    }

    private fun setUp(
        edges: Array<IntArray>,
        nodes: MutableSet<Int>,
        out: MutableMap<Int, MutableList<Int>>,
        inn: MutableMap<Int, MutableList<Int>>,
    ) {
        for (edge in edges) {
            val from = edge[0]
            val to = edge[1]
            out[from] = out.getOrDefault(from, mutableListOf())
            out[from]!!.add(to)
            inn[to] = inn.getOrDefault(to, mutableListOf())
            inn[to]!!.add(from)
            nodes.add(from)
            nodes.add(to)
        }
    }
}