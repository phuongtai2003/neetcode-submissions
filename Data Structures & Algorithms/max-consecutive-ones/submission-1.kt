class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var r = 0

        var maxSize = 0
        while(r < nums.size) {
            if(nums[r] == 1) {
                var currSize = 0
                while(r < nums.size && nums[r] == 1) {
                    currSize++
                    r++
                }
                maxSize = maxOf(maxSize, currSize)
            }else {
                r++
            }
        }

        return maxSize
    }
}
