class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while(left < right) {
            if(s[left] == s[right]) {
                left++
                right--
            } else {
                val removeFromLeft = isPalindrome(s, left+1, right)
                val removeFromRight = isPalindrome(s, left, right-1)
                return removeFromLeft || removeFromRight
            }
        }
        return true
    }

    private fun isPalindrome(s: String, left: Int, right: Int) : Boolean {
        var l = left
        var r = right

        while(l < r) {
            if(s[l] == s[r]) {
                l++
                r--
            }
            else {
                return false
            }
        }

        return true
    }
}
