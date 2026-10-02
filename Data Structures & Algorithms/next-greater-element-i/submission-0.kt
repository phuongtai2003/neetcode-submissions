class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = mutableMapOf<Int, Int>()

        for(i in 0 until nums2.size) {
            val currNum = nums2[i]
            var nextGreat = -1
            for(j in i+1 until nums2.size) {
                if(currNum < nums2[j]) {
                    nextGreat = nums2[j]
                    break
                }
            }
            hashMap[currNum] = nextGreat
        }

        val result = IntArray(nums1.size) { i ->
            hashMap[nums1[i]] ?: -1
        }

        return result
    }
}
