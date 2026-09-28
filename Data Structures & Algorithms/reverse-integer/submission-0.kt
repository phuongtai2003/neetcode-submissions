class Solution {
    fun reverse(x: Int): Int {
        val MIN = -2147483648 // -2^31
        val MAX = 2147483647  // 2^31 - 1

        var res = 0
        var num = x
        while (num != 0) {
            val digit = (num % 10).toInt()
            num /= 10

            if (res > MAX / 10 || (res == MAX / 10 && digit > MAX % 10)) {
                return 0
            }
            if (res < MIN / 10 || (res == MIN / 10 && digit < MIN % 10)) {
                return 0
            }
            res = res * 10 + digit
        }

        return res
    }
}