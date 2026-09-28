class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val longestLength = maxOf(word1.length, word2.length)
        val stringBuilder = StringBuilder()
        for(i in 0 until longestLength) {
            stringBuilder.apply {
                append(word1.getOrNull(i) ?: "")
                append(word2.getOrNull(i) ?: "")
            }
        }
        return stringBuilder.toString()
    }
}
