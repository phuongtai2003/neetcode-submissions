class Solution {
    private lateinit var memo: Array<IntArray>

    private fun dfs(i: Int, j: Int, nums: IntArray): Int {
        if (i == nums.size) {
            return 0
        }
        if (memo[i][j + 1] != -1) {
            return memo[i][j + 1]
        }

        var LIS = dfs(i + 1, j, nums)

        if (j == -1 || nums[j] < nums[i]) {
            LIS = maxOf(LIS, 1 + dfs(i + 1, i, nums))
        }

        memo[i][j + 1] = LIS
        return LIS
    }

    fun lengthOfLIS(nums: IntArray): Int {
        val n = nums.size
        memo = Array(n) { IntArray(n + 1) { -1 } }
        return dfs(0, -1, nums)
    }
}