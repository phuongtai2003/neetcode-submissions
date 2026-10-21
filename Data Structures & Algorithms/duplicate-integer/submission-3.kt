class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val n = nums.size
        for(i in 0 until n - 1) {
            for(j in i+1 until n) {
                if(nums[i] == nums[j]) return true
            }
        }

        return false
    }
}
