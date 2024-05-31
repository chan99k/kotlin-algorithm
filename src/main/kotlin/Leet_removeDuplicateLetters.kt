import java.util.*

class Leet_removeDuplicateLetters {
    fun removeDuplicateLetters(s: String): String {
        val sortedSet = toSortedSet(s)
        for (c in sortedSet) {
            val suffix = s.substring(s.indexOf(c)) // 해당 문자가 포한된 부분부터 접미사로 지정
            // 전체 집합과 접미사 집합이 일치하면 해당 문자를 정답에 추가하고 재귀 호출을 진행
            val suffixSet = toSortedSet(suffix)
            if (sortedSet == suffixSet) {
                return c + removeDuplicateLetters(suffix.replace(c.toString(), ""))
            }
        }
        return ""
    }

    private fun toSortedSet(s: String): TreeSet<Char> {
        val result = TreeSet<Char> { o1, o2 ->
            if (o1 == o2) {
                0
            } else if (o1 > o2) {
                1
            } else {
                -1
            }
        }

        for (i in s.indices) {
            result.add(s[i])
        }
        return result
    }


}