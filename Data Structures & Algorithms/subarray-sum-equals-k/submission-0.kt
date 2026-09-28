class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var res = 0
        for (i in nums.indices) {
            var sum = 0
            for (j in i until nums.size) {
                sum += nums[j]
                if (sum == k) res++
            }
        }
        return res
    }
}