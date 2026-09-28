class Solution {
    fun maxArea(heights: IntArray): Int {
        var l = 0
        var r = heights.size - 1

        var maxArea = 0
        while(l < r) {
            val width = r - l
            val height = minOf(heights[l], heights[r])
            val area = width * height

            maxArea = maxOf(maxArea, area)

            if(heights[l] < heights[r]) {
                l++
            } else {
                r--
            }
        }

        return maxArea
    }
}
