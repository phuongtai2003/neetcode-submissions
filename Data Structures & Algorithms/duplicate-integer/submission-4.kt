class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val dupSet = mutableSetOf<Int>()
        for(num in nums) {
            if(dupSet.contains(num)) return true
            dupSet.add(num)
        }

        return false
    }
}
