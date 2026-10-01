class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val numSet = mutableSetOf<Int>()

        for(num in nums) {
            numSet.add(num)
        }
        val result = mutableListOf<Int>()
        val n = nums.size
        for(num in 1..n) {
            if(num !in numSet) {
                result.add(num)
            }
        }

        return result
    }
}
