class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var prod = 1
        val res = IntArray(nums.size)

        for(i in 0 until nums.size) {
            res[i] = prod
            prod *= nums[i]
        }

        var revProd = nums[nums.size - 1]
        for(i in nums.size - 2 downTo 0) {
            res[i] *= revProd
            revProd *= nums[i]
        }

        return res
    }
}
