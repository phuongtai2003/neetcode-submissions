class Solution {
    fun moveZeroes(nums: IntArray) {
        var l = 0
        for(i in nums.indices) {
            if(nums[i] != 0) {
                val temp = nums[i]
                nums[i] = nums[l]
                nums[l] = temp
                l++
            }
        }
    }
}
