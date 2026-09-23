class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s.isEmpty()) return true
        if(t.isEmpty() && s.isNotEmpty()) return false
        var sIndex = 0
        var tIndex = 0

        while(tIndex < t.length) {
            if(t[tIndex] == s[sIndex]) {
                if(sIndex == s.length - 1) return true
                sIndex++
            }
            tIndex++
        }

        return false
    }
}
