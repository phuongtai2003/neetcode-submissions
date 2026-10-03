class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var goodPairs = 0

        val occurance = mutableMapOf<Int, Int>()

        for(num in nums) {
            goodPairs += (occurance[num] ?: 0)
            occurance[num] = (occurance[num] ?: 0) + 1
        }
        

        return goodPairs
    }
}