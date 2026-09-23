class Solution {
    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var charArray = n.toString().toCharArray()

        while(true) {
            val sum = charArray.map {
                it.digitToInt() * it.digitToInt()
            }.sum()
            if(sum == 1) return true
            if(seen.contains(sum)) return false
            seen.add(sum)
            charArray = sum.toString().toCharArray()
        }

        return true
    }
}
