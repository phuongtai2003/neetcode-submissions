class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val freq = IntArray(26)

        for(ch in chars) {
            freq[ch-'a']++
        }

        var res = 0
        for(word in words) {
            val copiedFreq = freq.copyOf()
            var good = true
            for(ch in word) {
                if(copiedFreq[ch-'a'] == 0) {
                    good = false
                    break
                }
                copiedFreq[ch-'a']--
            }

            if(good) {
                res += word.length
            }
        }

        return res
    }
}