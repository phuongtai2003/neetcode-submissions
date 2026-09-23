class Solution {
    fun moveZeroes(nums: IntArray) {
        var left = 0
        var right = 0
        while(right < nums.size) {
            if(nums[right] != 0) {
                val temp = nums[right]
                nums[right] = nums[left]
                nums[left++] = temp 
            }
            right++
        }
    }
}
