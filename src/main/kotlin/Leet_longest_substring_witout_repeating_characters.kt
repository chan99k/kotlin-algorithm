class Leet_longest_substring_witout_repeating_characters {
    fun lengthOfLongestSubstring(s: String): Int {
        val map: MutableMap<Char, Int> = mutableMapOf()
        var start = 0
        var maxLength = 0

        for ((i, c) in s.withIndex()) {
            if (!map.containsKey(c)) {
                val length = i - start + 1
                maxLength = length.coerceAtLeast(maxLength)
                map[c] = i
                continue
            }
            val seekPoint = map[c]!! + 1
            start = start.coerceAtLeast(seekPoint)
        }

        return maxLength
    }
}