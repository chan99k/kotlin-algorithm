class Leet_validParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (char in s.toCharArray()) {
            if (stack.isEmpty()) {
                if ("([{".contains(char)) {
                    stack.add(char)
                    continue
                }
                return false
            }
            if (")]}".contains(char)) {
                when (char) {
                    ')' -> if (stack.last() == '(') {
                        stack.removeLast()
                        continue
                    } else {
                        return false
                    }

                    ']' -> if (stack.last() == '[') {
                        stack.removeLast()
                        continue
                    } else {
                        return false
                    }

                    '}' -> if (stack.last() == '{') {
                        stack.removeLast()
                        continue
                    } else {
                        return false
                    }
                }
            }
            stack.add(char)
        }

        return stack.size == 0
    }
}