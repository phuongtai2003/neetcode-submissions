class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val reminderMap = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            val reminder = target - nums[i]

            if(reminderMap[reminder] == null) {
                reminderMap[nums[i]] = i
            } else {
                return intArrayOf(reminderMap[reminder]!!, i)
            }
        }

        throw IllegalArgumentException()
    }
}
