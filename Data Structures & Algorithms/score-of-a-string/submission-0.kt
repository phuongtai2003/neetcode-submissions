class Solution {
    fun scoreOfString(s: String): Int {
        var result = 0

        for(i in 0 until s.length - 1) {
            val diff = Math.abs(s[i] - s[i+1])
            result += diff
        }

        return result
    }
}
