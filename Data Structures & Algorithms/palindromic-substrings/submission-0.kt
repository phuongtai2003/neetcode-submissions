class Solution {
    fun countSubstrings(s: String): Int {
        var res = 0
        for(i in s.indices) {
            res += countPalindromeSubstring(s, i, i)
            res += countPalindromeSubstring(s, i, i + 1)
        }
        return res
    }

    private fun countPalindromeSubstring(
        s: String,
        left: Int,
        right: Int
    ) : Int {
        var res = 0
        var l = left
        var r = right
        while(l>= 0 && r < s.length && s[l] == s[r]) {
            res++
            l--
            r++
        }
        return res
    }
}
