class Solution {
    fun partition(s: String): List<List<String>> {
        val n = s.length
        val dp = Array(n) { BooleanArray(n) }

        for (l in 1..n) {
            for (i in 0..n - l) {
                dp[i][i + l - 1] = s[i] == s[i + l - 1] &&
                                   (i + 1 > (i + l - 2) || dp[i + 1][i + l - 2])
            }
        }

        val res = mutableListOf<List<String>>()
        val part = mutableListOf<String>()

        fun dfs(i: Int) {
            if (i >= s.length) {
                res.add(part.toList())
                return
            }
            for (j in i until s.length) {
                if (dp[i][j]) {
                    part.add(s.substring(i, j + 1))
                    dfs(j + 1)
                    part.removeAt(part.size - 1)
                }
            }
        }

        dfs(0)
        return res
    }
}