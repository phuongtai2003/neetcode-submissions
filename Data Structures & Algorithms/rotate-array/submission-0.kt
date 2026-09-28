class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val reducedRotate = k % nums.size
        reverse(nums, 0, nums.size - 1)

        reverse(nums, 0, reducedRotate - 1)
        reverse(nums, reducedRotate, nums.size - 1)
    }

    private fun reverse(nums: IntArray, left: Int, right: Int) {
        var l = left
        var r = right
        while(l < r) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
            r--
        }
    }
}
