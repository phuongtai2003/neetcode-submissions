class Solution {
    fun divideArray(nums: IntArray): Boolean {
        if(nums.size % 2 != 0) return false

        val numFreq = mutableMapOf<Int,Int>()

        for(num in nums) {
            numFreq[num] = (numFreq[num]?:0) + 1
        }

        for((key, freq) in numFreq) {
            if(freq % 2 != 0) return false
        }
        return true
    }
}