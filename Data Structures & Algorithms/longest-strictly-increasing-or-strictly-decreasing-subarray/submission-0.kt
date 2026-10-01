class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var longestIncrease = 1
        var longestDecrease = 1

        var currIncrease = 1
        var currDecrease = 1
        for(i in 1 until nums.size) {
            if(nums[i] > nums[i-1]) {
                currIncrease += 1
                currDecrease = 1
            } else if(nums[i] < nums[i-1]) {
                currIncrease = 1
                currDecrease += 1
            } else {
                currIncrease = 1
                currDecrease = 1
            }
            longestIncrease = maxOf(longestIncrease, currIncrease)
            longestDecrease = maxOf(longestDecrease, currDecrease)
        }

        return maxOf(longestIncrease, longestDecrease)
    }
}
