class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n = nums.size

        for(i in 0 until n - 1) {
            for (j in i+1 until n) {
                if(nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }

        return intArrayOf(-1, -1)
    }
}
