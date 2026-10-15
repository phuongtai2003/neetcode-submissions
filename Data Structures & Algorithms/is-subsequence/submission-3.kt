class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s.length > t.length) return false

        var sIndex = 0
        var tIndex = 0
        while(tIndex < t.length) {
            if(s.getOrNull(sIndex) == t.getOrNull(tIndex)) {
                sIndex++
            }
            tIndex++
        }

        return sIndex == s.length
    }
}
