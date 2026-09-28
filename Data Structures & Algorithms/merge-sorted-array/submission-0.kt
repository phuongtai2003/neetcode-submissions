class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var mIdx = m
        var nIdx = n
        var last = m + n - 1

        // Merge in reverse order
        while (mIdx > 0 && nIdx > 0) {
            if (nums1[mIdx - 1] > nums2[nIdx - 1]) {
                nums1[last] = nums1[mIdx - 1]
                mIdx--
            } else {
                nums1[last] = nums2[nIdx - 1]
                nIdx--
            }
            last--
        }

        // Fill nums1 with leftover nums2 elements
        while (nIdx > 0) {
            nums1[last] = nums2[nIdx - 1]
            nIdx--
            last--
        }
    }
}