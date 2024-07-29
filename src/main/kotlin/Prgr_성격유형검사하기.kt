import kotlin.math.abs

class Prgr_성격유형검사하기 {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val map = sortedMapOf<String, Int>(
            "N" to 0,
            "A" to 0,
            "C" to 0,
            "F" to 0,
            "M" to 0,
            "J" to 0,
            "R" to 0,
            "T" to 0
        )

        // RT, AN, CF, MJ
        for (i in survey.indices) {
            val a = survey[i][0].toString()
            val b = survey[i][1].toString()
            when (val choice = choices[i]) {
                4 -> continue
                in 1..3 -> map[a] = map.getOrDefault(a, 0) + abs(4 - choice)
                in 5..7 -> map[b] = map.getOrDefault(b, 0) + abs(4 - choice)
            }
        }

        val answer = StringBuilder()
        if (map["R"]!! >= map["T"]!!) answer.append("R") else answer.append("T")
        if (map["C"]!! >= map["F"]!!) answer.append("C") else answer.append("F")
        if (map["J"]!! >= map["M"]!!) answer.append("J") else answer.append("M")
        if (map["A"]!! >= map["N"]!!) answer.append("A") else answer.append("N")

        return answer.toString()
    }
}