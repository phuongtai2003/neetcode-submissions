class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val oddSet = mutableSetOf<Int>()

        for(num in nums) {
            if(num in oddSet) {
                oddSet.remove(num)
            } else {
                oddSet.add(num)
            }
        }

        return oddSet.isEmpty()
    }
}