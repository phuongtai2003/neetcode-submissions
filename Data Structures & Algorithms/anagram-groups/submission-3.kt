class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resMap = mutableMapOf<List<Int>, MutableList<String>>()

        for(str in strs) {
            val freq = IntArray(26)

            for(ch in str) {
                freq[ch - 'a']++
            }

            val k = freq.toList()

            resMap.getOrPut(k) {mutableListOf<String>()}.add(
                str
            )
        }

        return resMap.values.toList()
    }
}
