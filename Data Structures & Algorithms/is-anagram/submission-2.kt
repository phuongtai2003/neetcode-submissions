class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val freqS = IntArray(26)
        val freqT = IntArray(26)

        if(s.length != t.length) return false

        for(i in 0 until s.length) {
            freqS[s[i] - 'a']++
            freqT[t[i] - 'a']++
        }

        for(i in 0 until freqS.size) {
            if(freqS[i] != freqT[i]) return false
        }

        return true
    }
}
