class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val hashMap = mutableMapOf<Char, String>()
        val stringList = s.split("\\s+".toRegex())
        val charArr = pattern.toCharArray()

        if(stringList.size != charArr.size) return false

        for(i in 0 until charArr.size) {
            val ch = charArr[i]
            val stringItem = stringList[i]
            if(hashMap.containsKey(ch) && hashMap[ch] != stringItem) {
                return false
            }
            val key = hashMap.entries.find { it.value == stringItem }?.key
            if(key != null && key != ch) return false
            hashMap[ch] = stringItem
        }

        return true
    }
}