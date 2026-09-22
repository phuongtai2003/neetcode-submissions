class Solution {
    fun getSum(a: Int, b: Int): Int {
        var carry = 0
        var res = 0
        val mask = 0xFFFFFFFF.toInt()

        for (i in 0 until 32) {
            val aBit = (a shr i) and 1
            val bBit = (b shr i) and 1
            val curBit = aBit xor bBit xor carry
            carry = if (aBit + bBit + carry >= 2) 1 else 0
            if (curBit == 1) {
                res = res or (1 shl i)
            }
        }

        if (res > 0x7FFFFFFF) {
            res = res.inv() xor mask
        }

        return res
    }
}