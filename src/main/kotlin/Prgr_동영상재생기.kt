class Prgr_동영상재생기 {

    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val start = op_start.split(":").map { Integer.parseInt(it) }
        val end = op_end.split(":").map { Integer.parseInt(it) }
        val len = video_len.split(":").map { (Integer.parseInt(it)) }
        val curr = pos.split(":").map { Integer.parseInt(it) }.toMutableList()

        for (command in commands) {
            if (command == "prev") {
                if (isOpeningPositions(curr, start, end)) {
                    curr[0] = end[0]
                    curr[1] = end[1]
                }
                val nm = curr[1] - 10;
                curr[1] = nm
                if (nm < 0) {
                    curr[0] = curr[0] - 1
                    curr[1] = 60 + nm
                }
                if (curr[0] <= 0 && curr[0] <= 0) {
                    curr[0] = 0
                    curr[1] = 0
                }
                if (isOpeningPositions(curr, start, end)) {
                    curr[0] = end[0]
                    curr[1] = end[1]
                }
                continue
            } else if (command == "next") {
                if (isOpeningPositions(curr, start, end)) {
                    curr[0] = end[0]
                    curr[1] = end[1]
                }
                val nm = curr[1] + 10;
                curr[1] = nm
                if (nm >= 60) {
                    curr[0] = curr[0] + (nm % 60)
                    curr[1] = curr[1] + (nm / 60)
                }
                if (curr[0] >= len[0] && curr[0] >= len[1]) {
                    curr[0] = len[0]
                    curr[1] = len[1]

                }
                if (isOpeningPositions(curr, start, end)) {
                    curr[0] = end[0]
                    curr[1] = end[1]
                }
            }
        }

        return curr.joinToString(":") { String.format("%02d", it) }
    }

    private fun isOpeningPositions(curr: List<Int>, start: List<Int>, end: List<Int>): Boolean {
        val hh = curr[0]
        val mm = curr[1]
        return (hh * 60 + mm >= start[0] * 60 + start[1]) && (hh * 60 + mm <= end[0] * 60 + end[1])
    }


}