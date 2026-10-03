class Solution {
    fun largestGoodInteger(num: String): String {
        var maxValue = ""

        for (i in 0 until num.length - 2) {
            if(num[i] == num[i+1] && num[i+1] == num[i+2]) {
                val curr = num.substring(i, i+3)

                if(maxValue == "" || curr.toInt() > maxValue.toInt()) {
                    maxValue = curr
                }
            }
        }

        return maxValue
    }
}