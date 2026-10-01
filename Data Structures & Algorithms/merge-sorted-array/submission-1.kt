class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var last = m + n - 1
        var mIndex = m - 1
        var nIndex = n - 1

        while(mIndex >= 0 && nIndex >= 0) {
            if(nums1[mIndex] > nums2[nIndex]) {
                nums1[last--] = nums1[mIndex--]
            } else {
                nums1[last--] = nums2[nIndex--]
            }
        }

        while(nIndex >= 0) {
            nums1[last--] = nums2[nIndex--]
        }
    }
}
