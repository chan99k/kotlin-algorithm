class `Leet_Merge Intervals` {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { median(it) }
        val answer = mutableListOf<IntArray>()
        var i = 0
        while (i < intervals.size - 1) {
            var j = i + 1
            val start = i
            if (j<intervals.size && intervals[i][1] >= intervals[j][0]) {
                while (i<intervals.size && j<intervals.size && intervals[i][1] >= intervals[j][0]) {
                    i = j++
                }
                answer.add(intArrayOf(intervals[start][0], intervals[j-1][1]))
            }
            i++
            if(i < intervals.size) answer.add(intervals[i])
        }
        return answer.toTypedArray()
    }

    private fun median(arr: IntArray): Int {
        return (arr[1] + arr[0]) / 2
    }

}

