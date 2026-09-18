class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val charFreqs = IntArray(26)
        for(i in 0..<s.length) {
            val sChar = s[i]
            val tChar = t[i]

            charFreqs[sChar - 'a'] += 1
            charFreqs[tChar - 'a'] -= 1
        }

        for(freq in charFreqs) {
            if(freq > 0) return false
        }
        return true
    }
}
