class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var goodPairs = 0

        for(i in 0 until nums.size - 1) {
            for(j in i+1 until nums.size) {
                if(nums[i] == nums[j]) {
                    goodPairs+=1
                }
            }
        }

        return goodPairs
    }
}