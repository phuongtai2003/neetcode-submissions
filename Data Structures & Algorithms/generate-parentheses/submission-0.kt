class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val stack = mutableListOf<String>()
        val res = mutableListOf<String>()

        fun backtrack(openN: Int, closedN: Int) {
            if (openN == n && closedN == n) {
                res.add(stack.joinToString(""))
                return
            }

            if (openN < n) {
                stack.add("(")
                backtrack(openN + 1, closedN)
                stack.removeAt(stack.lastIndex)
            }

            if (closedN < openN) {
                stack.add(")")
                backtrack(openN, closedN + 1)
                stack.removeAt(stack.lastIndex)
            }
        }

        backtrack(0, 0)
        return res
    }
}