class NumArray(private val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var l = left
        var r = right
        var sum = 0
        while(l <= r) {
            sum += nums[l]
            l++
        }
        return sum
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */