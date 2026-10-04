class Solution {
    fun check(nums: IntArray): Boolean {
        val n = nums.size
        var numberOfDecreased = 2

        for(i in 0 until n) {
            if(nums[i] > nums[(i + 1) % n]) {
                numberOfDecreased--

                if(numberOfDecreased == 0) return false
            }
        }

        return true
    }
}