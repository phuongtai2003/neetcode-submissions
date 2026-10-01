class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        var sum = n*(n+1)/2

        for(num in nums) {
            sum -= num
        }

        return sum
    }
}
