class `Leet_Longest Common Prefix` {
    fun longestCommonPrefix(strs: Array<String>): String {
        val arr = strs.sortedArray()
        val s = arr[0]
        val answer = StringBuilder()
        for (i in s.indices) {
            for (str in arr) {
                if (s[i] != str[i])
                    return answer.toString()
            }
            answer.append(s[i])
        }
        return answer.toString()
    }
}