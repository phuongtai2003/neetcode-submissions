class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minSize = Integer.MAX_VALUE
        var l = 0
        var r = 0
        var sum = 0
        while(r < nums.size) {
            sum += nums[r]

            while(l <= r && sum >= target) {
                sum -= nums[l]
                minSize = minOf(minSize, r - l + 1)
                l++
            }

            r++
        }
        return if(minSize == Integer.MAX_VALUE) 0 else minSize
    }
}
