class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        val result = StringBuilder()

        val shortestString = strs.minByOrNull { it.length }
        if(shortestString == null) return ""

        for(i in 0 until shortestString.length) {
            val character = shortestString[i]
            for(j in 0 until strs.size) {
                if(character != strs[j][i]) return result.toString()
            }
            result.append(character)
        }
        return result.toString()
    }
}