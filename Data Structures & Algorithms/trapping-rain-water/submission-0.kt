class Solution {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0

        val stack = ArrayDeque<Int>()
        var res = 0

        for (i in height.indices) {
            while (stack.isNotEmpty() && height[i] >= height[stack.first()]) {
                val mid = stack.removeFirst()
                if (stack.isNotEmpty()) {
                    val left = stack.first()
                    val right = height[i]
                    val h = minOf(right, height[left]) - height[mid]
                    val w = i - left - 1
                    res += h * w
                }
            }
            stack.addFirst(i)
        }
        return res
    }
}