class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for(i in 0 until s.length) {
            val currChar = s[i]
            if(currChar == '[' || currChar == '(' || currChar == '{') {
                stack.addLast(currChar)
            } else {
                val topOfStack = stack.pollLast()

                if(currChar == ']' && topOfStack != '[') return false
                if(currChar == '}' && topOfStack != '{') return false
                if(currChar == ')' && topOfStack != '(') return false
            }
        }
        return stack.isEmpty()
    }
}
