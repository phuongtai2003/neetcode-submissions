class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 0
        var r = 0

        while(r < nums.size) {
            nums[l] = nums[r]
            while(r < nums.size && nums[l] == nums[r]) {
                r++
            }
            l++
        } 

        return l
    }
}
