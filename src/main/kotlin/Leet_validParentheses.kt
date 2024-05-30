class Leet_validParentheses {

    fun isValid(s: String): Boolean {
        val table: Map<Char, Char> = mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{',
        )
        val stack: ArrayDeque<Char> = ArrayDeque()

        for (i in s.indices) {
            if (!table.containsKey(s[i])) {
                stack.addLast(s[i])
            } else if (stack.isEmpty() || table[s[i]] != stack.removeLast()) {
                return false
            }
        }
        return stack.isEmpty()
    }
}