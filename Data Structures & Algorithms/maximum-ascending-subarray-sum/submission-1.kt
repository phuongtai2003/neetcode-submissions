class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var currentSum = nums[0]
        var maxSum = nums[0]

        for (i in 1 until nums.size) {
            if(nums[i] > nums[i-1]) {
               currentSum+= nums[i]
            }else {
                currentSum = nums[i]
            }
            maxSum = maxOf(maxSum, currentSum)
        }

        return maxSum
    }
}