class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = mutableMapOf<Int, Int>()

        for(i in 0 until nums.size) {
            val remainder = target - nums[i]
            if(numMap[remainder] != null) {
                return intArrayOf(numMap[remainder]!!, i)
            }
            numMap.put(nums[i], i)
        }

        return intArrayOf(-1, -1)
    }
}
