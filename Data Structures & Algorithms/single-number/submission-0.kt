class Solution {
    fun singleNumber(nums: IntArray): Int {
        val freqMap = HashMap<Int, Int>()
        for(num in nums) {
            freqMap[num] = (freqMap[num] ?: 0) + 1
        }
        for ((number, freq) in freqMap) {
            if(freq == 1) return number
        }

        throw IllegalArgumentException("No element found")
    }
}
