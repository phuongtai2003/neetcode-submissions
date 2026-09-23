class Solution {
    fun longestPalindrome(s: String): Int {
        val seen = mutableSetOf<Char>()
        var res = 0

        for (c in s) {
            if (c in seen) {
                seen.remove(c)
                res += 2
            } else {
                seen.add(c)
            }
        }

        return if (seen.isEmpty()) res else res + 1
    }
}