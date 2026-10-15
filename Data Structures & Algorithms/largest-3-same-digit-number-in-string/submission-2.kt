class Solution {
    fun largestGoodInteger(num: String): String {
        var result = ""
        val n = num.length
        for(i in 0 until n - 2) {
            if(num[i] == num[i+1] && num[i+1] == num[i+2]) {
                val subString = num.substring(i, i+3)

                if(result == "" || subString.toInt() > result.toInt()) {
                    result = subString
                }
            }
        }
        return result
    }
}
