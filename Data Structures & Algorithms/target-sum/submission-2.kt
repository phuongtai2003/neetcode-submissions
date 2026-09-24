class Solution {
    private val memo = mutableMapOf<Pair<Int, Int>, Int>()

    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        memo.clear()

        fun dp(index: Int, sum: Int): Int {
            if (index == nums.size) {
                return if (sum == target) 1 else 0
            }

            val key = index to sum
            memo[key]?.let { return it }

            val result =
                dp(index + 1, sum + nums[index]) +
                dp(index + 1, sum - nums[index])

            memo[key] = result
            return result
        }

        return dp(0, 0)
    }
}