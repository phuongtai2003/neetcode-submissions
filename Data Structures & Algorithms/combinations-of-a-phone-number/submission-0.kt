class Solution {
    private val charMapper = listOf(
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        val result = mutableListOf<String>()

        backtracking(
            0,
            digits,
            StringBuilder(),
            result
        )

        return result
    }

    private fun backtracking(
        index: Int,
        digits: String,
        curr: StringBuilder,
        result: MutableList<String>
    ) {
        if (index == digits.length) {
            result.add(curr.toString())
            return
        }

        val letters = charMapper[digits[index] - '2']

        for (ch in letters) {
            curr.append(ch)

            backtracking(
                index + 1,
                digits,
                curr,
                result
            )

            curr.deleteCharAt(curr.lastIndex)
        }
    }
}