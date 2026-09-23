class Solution {
    fun myPow(x: Double, n: Int): Double {
        var base = x
        var power = n.toLong()
        var result = 1.0

        if (power < 0) {
            base = 1 / base
            power = -power
        }

        while (power > 0) {
            if (power % 2 == 1L) {
                result *= base
            }

            base *= base
            power /= 2
        }

        return result
    }
}