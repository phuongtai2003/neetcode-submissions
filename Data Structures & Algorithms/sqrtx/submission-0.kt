class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x

        while(left <= right) {
            val mid = left + (right - left) /2
            val midRes = mid.toLong()*mid
            if(midRes > x) {
                right = mid - 1
            }
            else if(midRes < x) {
                left = mid + 1
            }
            else {
                return mid.toInt()
            }
        }
        return right
    }
}
