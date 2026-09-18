class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val targetMap = mutableMapOf<Int, Int>()

        for(index in nums.indices) {
            val left = target - nums[index]
            val result = targetMap[left]
            if(result != null) {
                return intArrayOf(result,index)
            }
            else {
                targetMap.put(nums[index], index)
            }
        }

        throw IllegalArgumentException("No available combination exist")
    }
}
