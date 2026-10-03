class Solution {
    fun addBinary(a: String, b: String): String {
        val maxSize = maxOf(a.length, b.length)
        val reverseA = StringBuilder(a).reverse().toString()
        val reverseB = StringBuilder(b).reverse().toString()
        val reverseRes = StringBuilder()
        var carry = 0

        for(i in 0 until maxSize) {
            val charA = reverseA.getOrNull(i)?.digitToInt() ?: 0
            val charB = reverseB.getOrNull(i)?.digitToInt() ?: 0
            val res = charA + charB + carry

            if(res == 3) {
                carry = 1
                reverseRes.append("1")
            } else if(res == 2) {
                carry = 1
                reverseRes.append("0")
            }
            else {
                carry = 0
                reverseRes.append(res.toString())
            }
        }

        if(carry == 1) {
            reverseRes.append("1")
        }

        return reverseRes.reverse().toString()
    }
}
