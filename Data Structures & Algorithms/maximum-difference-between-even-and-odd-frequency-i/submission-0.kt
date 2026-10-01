class Solution {
    fun maxDifference(s: String): Int {
        val freqArr = IntArray(26)

        for(i in 0 until s.length) {
            freqArr[s[i] - 'a']++
        }

        var minEven = Integer.MAX_VALUE
        var maxOdd = Integer.MIN_VALUE

        for(i in freqArr.indices) {
            if(freqArr[i] == 0) continue
            if(freqArr[i] % 2 != 0 && maxOdd < freqArr[i]) {
                maxOdd = freqArr[i]
            } else if(freqArr[i] % 2 == 0 && minEven > freqArr[i]) {
                minEven = freqArr[i]
            }
        }

        return maxOdd - minEven
    }
}
