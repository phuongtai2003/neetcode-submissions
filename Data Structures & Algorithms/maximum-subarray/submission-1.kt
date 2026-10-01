class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var r = 1

        var maxSum = nums[0]
        var currSum = nums[0]
        while(r < nums.size) {
            if(currSum < 0) {
                currSum = nums[r]
            } else {
                currSum += nums[r]
            }

            maxSum = maxOf(maxSum, currSum)
            r++
        }

        return maxSum
    }
}
