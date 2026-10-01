class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()

        var leftSum = 0
        for(i in 0 until nums.size) {
            val rightSum = total - leftSum - nums[i]
            if(leftSum == rightSum) return i
            leftSum += nums[i]
        }
        return -1
    }
}
