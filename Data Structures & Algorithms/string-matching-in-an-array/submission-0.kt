class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val res = mutableListOf<String>()
        words.sortBy {
            it.length
        }

        for(i in 0 until words.size - 1) {
            for(j in i+1 until words.size) {
                if(words[j].contains(words[i])) {
                    res.add(words[i])
                    break
                }
            }
        }

        return res.toList()
    }
}
