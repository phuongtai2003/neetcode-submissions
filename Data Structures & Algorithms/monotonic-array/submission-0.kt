class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var isIncreasing = false
        var isDecreasing = false

        for(i in 1 until nums.size) {
            if(nums[i] > nums[i-1]) {
                when (isDecreasing) {
                    true -> return false
                    false -> {
                        isIncreasing = true
                    }
                }
            } else if (nums[i] < nums[i-1]) {
                when (isIncreasing) {
                    true -> return false
                    false -> {
                        isDecreasing = true
                    }
                }
            }
        }

        return true
    }
}