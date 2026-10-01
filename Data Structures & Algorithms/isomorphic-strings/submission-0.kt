class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val hashMap = mutableMapOf<Char,Char>()

        for(i in 0 until s.length) {
            val sChar = s[i]
            val tChar = t[i]

            if(hashMap[sChar] != null && hashMap[sChar] != tChar) return false
            else {
                val key = hashMap.entries.firstOrNull { it.value == tChar }?.key
                if(key != null && key != sChar) return false
                hashMap[sChar] = tChar
            }
        }

        return true
    }
}
