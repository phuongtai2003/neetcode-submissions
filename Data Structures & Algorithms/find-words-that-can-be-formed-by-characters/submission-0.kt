class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val charsFreq = IntArray(26)

        for (ch in chars) {
            charsFreq[ch - 'a']++
        }

        var total = 0
        for (word in words) {
            val freq = charsFreq.copyOf()
            var good = true
            for(ch in word) {
                if(freq[ch-'a'] == 0) {
                    good = false
                    break
                }
                freq[ch-'a']--
            }
            if(good == true){
                total += word.length
            }
        }

        return total
    }
}