class Solution {
    fun missingNumber(nums: IntArray): Int {
        val numSet = nums.toSet()
        val n = nums.size
        for (i in 0..n) {
            if (i !in numSet) {
                return i
            }
        }
        return -1
    }
}
