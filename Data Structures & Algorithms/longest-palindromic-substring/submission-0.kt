class Solution {
    fun longestPalindrome(s: String): String {
        var result = ""

        for (i in s.indices) {
            val evenPalindrome = expand(s, i, i)
            result = if(result.length > evenPalindrome.length) result else evenPalindrome
            val oddValindrome = expand(s, i, i+1)
            result = if(result.length > oddValindrome.length) result else oddValindrome
        }

        return result
    }

    private fun expand(s: String, left: Int, right: Int) : String {
        var i = left
        var j = right

        while(i >= 0 && j < s.length && s[i] == s[j]) {
            i--
            j++
        }

        return s.substring(i+1, j)
    }
}
