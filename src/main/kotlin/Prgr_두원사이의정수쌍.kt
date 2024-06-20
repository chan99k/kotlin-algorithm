import kotlin.math.ceil
import kotlin.math.sqrt

class Prgr_두원사이의정수쌍 {
    // 거리가 r1 보다는 크고 r2 보다는 작아야
    fun solution(r1: Int, r2: Int): Long {
        var answer: Long = 0
        for (i in 1 until r2 + 1) {
            val y2 = sqrt((r2 * r2 - i * i).toDouble()).toLong()
            val y1 = ceil(sqrt((r1 * r1 - i * i).toDouble())).toLong()
            answer += y2 - y1 + 1
        }
        return (answer * 4)
    }
}